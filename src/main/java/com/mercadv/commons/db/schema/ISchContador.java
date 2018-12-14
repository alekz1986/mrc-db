package com.mercadv.commons.db.schema;

import com.mercadv.commons.db.schema.contador.IMovimiento;

public interface ISchContador extends ISchema {

	String nameDataSource = "jdbc/ContadorDB";
	
	public IMovimiento getMovimiento();
	
}
