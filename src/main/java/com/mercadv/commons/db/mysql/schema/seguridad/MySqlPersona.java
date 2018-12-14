package com.mercadv.commons.db.mysql.schema.seguridad;

import com.mercadv.commons.db.schema.seguridad.IPersona;

public class MySqlPersona implements IPersona {

	@Override
	public void insert(Object persona) {
		System.out.println("Inserta nueva persona");
	}

}
