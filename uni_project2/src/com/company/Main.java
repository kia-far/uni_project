package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Repository repository = new Repository();
        repository.showName();
    }
}
