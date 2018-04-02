package com.tplan.util;

import com.google.gson.Gson;

public class GsonUtil {

	private static Gson gson = new Gson();

	public static String ObjectToGson(Object object) {

		return gson.toJson(object);

	}
	

}
