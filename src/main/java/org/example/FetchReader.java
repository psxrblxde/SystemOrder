package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

public class FetchReader {
        private HashMap<Integer, String> structOrder = new HashMap<>();
        private HashMap<String, Integer> menu = new HashMap<>();

        private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public HashMap<Integer, String> getStructOrder() {
        return structOrder;
    }

    public void setStructOrder(HashMap<Integer, String> structOrder) {
        this.structOrder = structOrder;
    }

    public HashMap<String, Integer> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Integer> menu) {
        this.menu = menu;
    }
}