package com.mercadv.commons.db.factory;

import com.mercadv.commons.db.schema.ISchContador;
import com.mercadv.commons.db.schema.ISchSeguridad;

public interface IDatabase {

	public ISchContador getSchemaContador();
	public ISchSeguridad getSchemaSeguridad();
	
}
