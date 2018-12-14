package com.mercadv.commons.db.mysql.schema.contador;

import com.mercadv.commons.db.schema.contador.IMovimiento;

public class MySqlMovimiento implements IMovimiento {

	@Override
	public void insertar() {
		System.out.println("Inserta nuevo Movimiento");
	}

}
