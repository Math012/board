package br.com.math012.persistence.dao;

import br.com.math012.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardDAO {

    private final Connection connection;


    private BoardEntity insert(final BoardEntity entity)throws SQLException{
        return null;
    }

    private void  delete(final Long id)throws SQLException{

    }

    private Optional<BoardEntity> findById(final Long id)throws SQLException{
        var query = "SELECT * FROM boards WHERE id=?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setLong(1, id);
            ps.executeQuery();
            var resultSet = ps.getResultSet();
            if (resultSet.next()){
                var entity = new BoardEntity();
                entity.setId(resultSet.getLong("id"));
                entity.setName(resultSet.getString("name"));
                return Optional.of(entity);
            }
           return Optional.empty();
        }
    }

    private boolean existsBoard(final Long id)throws SQLException{
        var query = "SELECT 1 FROM boards WHERE id=?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setLong(1, id);
            ps.executeQuery();
            return ps.getResultSet().next();
        }
    }
}
