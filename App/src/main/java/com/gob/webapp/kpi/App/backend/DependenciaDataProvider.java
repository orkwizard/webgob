package com.gob.webapp.kpi.App.backend;

import java.util.stream.Stream;

import com.gob.webapp.kpi.App.model.Dependencia;
import com.vaadin.data.provider.AbstractBackEndDataProvider;
import com.vaadin.data.provider.Query;

public class DependenciaDataProvider extends AbstractBackEndDataProvider<Dependencia,String> {

	@Override
	protected Stream<Dependencia> fetchFromBackEnd(Query<Dependencia, String> query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int sizeInBackEnd(Query<Dependencia, String> query) {
		// TODO Auto-generated method stub
		return 0;
	}

}
