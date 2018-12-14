package com.mercadv.commons.db.schema;

import java.sql.Connection;

import com.mercadv.commons.db.factory.ESchema;

public interface ISchema {

	String nameDataSource = null;
	
	public Connection getConnection();
	public ISchema getAnotherSchema(ESchema schema);
	
}
