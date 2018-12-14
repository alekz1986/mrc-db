package com.mercadv.commons.db.factory;

import com.mercadv.commons.db.mysql.MySql;

public class DatabaseFactory {

	public static IDatabase getDatabase(EDatabase type) {
		switch(type) {
		case MYSQL:
			return new MySql();
		}
		return null;
	}

}
