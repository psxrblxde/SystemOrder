package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;


public class order {
    public static void main(String[] args) {
        String json = "  \"TEA\": 15,\n" +
                "    \"APPLE\": 30,\n" +
                "    \"POTATO\": 100,\n" +
                "    \"BURGER\": 250,\n" +
                "    \"CAKE\": 300";

        Gson gson = new Gson();

        Type type = new TypeToken<HashMap<String, Object>>(){}.getType();

        HashMap<String, Integer> menu = gson.fromJson(json, type);

        for(String dish : menu.keySet()){
            System.out.println(dish + " " + menu.get(dish));
        }

    }
}
