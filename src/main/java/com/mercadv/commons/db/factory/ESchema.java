package com.mercadv.commons.db.factory;

import java.util.HashMap;
import java.util.Map;

public enum ESchema {

	SEGURIDAD("seguridad"),
	CONTADOR("contador");
	
	private String id;
	private static final Map<String, ESchema> lookup = new HashMap<>();
	
	ESchema(String text) {
		id = text;
	}
	
	public String getId() {
		return id;
	}


    static {
        for(ESchema env : ESchema.values()) {
            lookup.put(env.getId(), env);
        }
    }
  
    public static ESchema get(String url) {
        return lookup.get(url);
    }

}
