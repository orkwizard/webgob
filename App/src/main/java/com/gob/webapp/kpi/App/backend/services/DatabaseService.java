package com.gob.webapp.kpi.App.backend.services;

import java.io.IOException;

import com.mysql.jdbc.Connection;

public class DatabaseService {

	private static DatabaseService databaseService;
	  private Connection connPool;
	  
	  
	  
	  private DatabaseService() throws IOException {
	    // initialize a connection pool for H2
	    connPool = JdbcConnectionPool.create("jdbc:h2:tcp://localhost/d:/data-provider-example/example-db", "sa",
	        "pass");
	    System.out.println("DatabaseService instantiated...");
	  }
	  public static DatabaseService getInstance() throws IOException {
	    if (databaseService == null) {
	      databaseService = new DatabaseService();
	    }
	    return databaseService;
	  }
	  public Connection getConnection() throws SQLException {
	    return connPool.getConnection();
	  }
}
