package br.com.math012;

import br.com.math012.ui.MainMenu;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        new MainMenu().execute();
    }
}
