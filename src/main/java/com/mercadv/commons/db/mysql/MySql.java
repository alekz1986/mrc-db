package com.mercadv.commons.db.mysql;

import com.mercadv.commons.db.factory.IDatabase;
import com.mercadv.commons.db.mysql.schema.MySqlSchContador;
import com.mercadv.commons.db.mysql.schema.MySqlSchSeguridad;
import com.mercadv.commons.db.schema.ISchContador;
import com.mercadv.commons.db.schema.ISchSeguridad;

public class MySql implements IDatabase {

	@Override
	public ISchContador getSchemaContador() {
		return new MySqlSchContador();
	}

	@Override
	public ISchSeguridad getSchemaSeguridad() {
		return new MySqlSchSeguridad();
	}

	
}
