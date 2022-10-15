package org.example;

import static spark.Spark.*;

public class Main {
    private static DBConnection dBConnection = new DBConnection();

    public static void main(String args[]) {
        get("/hello", (req, res) -> "Hello World");
        dBConnection.connect();
    }

}