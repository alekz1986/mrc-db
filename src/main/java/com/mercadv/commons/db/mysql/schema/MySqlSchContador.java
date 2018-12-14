package com.mercadv.commons.db.mysql.schema;


import com.mercadv.commons.db.mysql.schema.contador.MySqlMovimiento;
import com.mercadv.commons.db.schema.ISchContador;
import com.mercadv.commons.db.schema.contador.IMovimiento;

public class MySqlSchContador extends MySqlSchema implements ISchContador {

	@Override
	public IMovimiento getMovimiento() {
		return new MySqlMovimiento();
	}



}
