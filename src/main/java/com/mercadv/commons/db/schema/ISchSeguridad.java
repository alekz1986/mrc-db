package com.mercadv.commons.db.schema;

import com.mercadv.commons.db.schema.seguridad.IPersona;
import com.mercadv.commons.db.schema.seguridad.IUsuario;

public interface ISchSeguridad extends ISchema {

	String nameDataSource = "jdbc/SeguridadDB";
	
	public IPersona getPersona();
	public IUsuario getUsuario();
	
}
