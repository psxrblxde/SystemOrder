package org.example;

import com.google.gson.Gson;

public class Bank {
    public static void main(String[] args) {
        String jsonKey = "  \"TEA\": 15,\n" +
                "    \"APPLE\": 30,\n" +
                "    \"POTATO\": 100,\n" +
                "    \"BURGER\": 250,\n" +
                "    \"CAKE\": 300";
        Gson gson =new Gson();
        Bank bank = gson.fromJson(jsonKey, Bank.class);
        System.out.println(bank);

    }
}
