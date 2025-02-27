package br.com.math012.service;

import br.com.math012.persistence.dao.BoardDAO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class BoardService {

    private final Connection connection;

    public boolean delete(final Long id) throws SQLException{
        BoardDAO boardDAO = new BoardDAO(connection);
        try {
            if (!boardDAO.existsBoard(id)){
                return false;
            }
            boardDAO.delete(id);
            connection.commit();
            return true;
        }catch (SQLException e){
            return false;
        }
    }
}
