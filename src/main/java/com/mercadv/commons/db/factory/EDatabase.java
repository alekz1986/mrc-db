package com.mercadv.commons.db.factory;

import java.util.HashMap;
import java.util.Map;

public enum EDatabase {

	
	MYSQL("mysql");
	
	private String id;
	private static final Map<String, EDatabase> lookup = new HashMap<>();
	
	EDatabase(String text) {
		id = text;
	}
	
	public String getId() {
		return id;
	}


    static {
        for(EDatabase env : EDatabase.values()) {
            lookup.put(env.getId(), env);
        }
    }
  
    public static EDatabase get(String url) {
        return lookup.get(url);
    }
	
}
