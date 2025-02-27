package br.com.math012.persistence.dao;

import br.com.math012.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RequiredArgsConstructor
public class BoardColumnDao {

    private final Connection connection;

    public BoardColumnEntity insert(final BoardColumnEntity boardColumnEntity) throws SQLException{
        var query = "INSERT INTO boards_columns(name,order_columns,kind,board_id) VALUES (?, ?, ?, ?)";
        try(PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, boardColumnEntity.getNome());
            ps.setInt(2, boardColumnEntity.getOrder());
            ps.setString(3, boardColumnEntity.getKind().name());
            ps.setLong(4, boardColumnEntity.getBoard().getId());
            ps.executeUpdate();
            return boardColumnEntity;
        }
    }
}
