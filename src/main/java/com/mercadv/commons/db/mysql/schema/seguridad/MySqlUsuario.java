package com.mercadv.commons.db.mysql.schema.seguridad;

import com.mercadv.commons.db.schema.seguridad.IUsuario;

public class MySqlUsuario implements IUsuario {

	@Override
	public void insert(Object usuario) {
		System.out.println("Inserta un nuevo usuario.");
	}

}
