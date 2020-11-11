package space.harbour.hw3;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> food = new HashMap<>();


        food.put("Burger", 1);
        food.put("Pizza", 2);
        food.put("Shrimps", 3);
        System.out.println("rankings of my favourite food " + food);
    }
}