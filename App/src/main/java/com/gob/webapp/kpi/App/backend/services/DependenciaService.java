package com.gob.webapp.kpi.App.backend.services;

import java.util.ArrayList;

import com.gob.webapp.kpi.App.model.Dependencia;
import com.mysql.jdbc.Connection;

public class DependenciaService {

	  public static final String SORT_ON_ID = "id";
	  public static final String SORT_ON_NAME = "dependencia";
	  
	  ArrayList<Dependencia> allDependencias(){
		  Connection conn;
		  
		  conn = DatabaseService.getInstance();
		  
	  }
	  
	  
}
