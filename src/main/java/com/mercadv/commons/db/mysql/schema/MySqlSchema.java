package com.mercadv.commons.db.mysql.schema;

import com.mercadv.commons.db.factory.ESchema;
import com.mercadv.commons.db.schema.ISchema;
import com.mercadv.commons.db.util.Schema;

public class MySqlSchema extends Schema {


	@Override
	public ISchema getAnotherSchema(ESchema schema) {
		switch (schema) {
			case CONTADOR:
				return new MySqlSchContador();
			case SEGURIDAD:
				return new MySqlSchSeguridad();
		}
		return null;
	}



}
