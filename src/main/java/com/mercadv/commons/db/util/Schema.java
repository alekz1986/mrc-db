package com.mercadv.commons.db.util;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mercadv.commons.db.factory.ESchema;
import com.mercadv.commons.db.schema.ISchema;

public abstract class Schema implements ISchema {

	@Override
	public Connection getConnection() {
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			//DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			DataSource ds = (DataSource)envContext.lookup(nameDataSource);
			return ds.getConnection();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}



}
