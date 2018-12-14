package com.mercadv.commons.db.mysql.schema;


import com.mercadv.commons.db.mysql.schema.seguridad.MySqlPersona;
import com.mercadv.commons.db.mysql.schema.seguridad.MySqlUsuario;
import com.mercadv.commons.db.schema.ISchSeguridad;
import com.mercadv.commons.db.schema.seguridad.IPersona;
import com.mercadv.commons.db.schema.seguridad.IUsuario;

public class MySqlSchSeguridad extends MySqlSchema implements ISchSeguridad {

	@Override
	public IPersona getPersona() {
		return new MySqlPersona();
	}

	@Override
	public IUsuario getUsuario() {
		return new MySqlUsuario();
	}

	

}
