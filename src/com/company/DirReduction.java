package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        List<String> northSouth = new ArrayList<>(Arrays.asList("NORTH", "SOUTH"));
        List<String> eastWest = new ArrayList<>(Arrays.asList("EAST", "WEST"));
        boolean flag = true;
        while (flag) {
            flag = deleteDirection(list, northSouth) || deleteDirection(list, eastWest);
        }
        return list.stream().toArray(String[]::new);
    }
    private static boolean deleteDirection(List<String> list, List<String> directionsArray) {
        boolean flag = false;
        for (int i = 1; i < list.size(); i++)
            if (directionsArray.contains(list.get(i - 1)) && directionsArray.contains(list.get(i)) && list.get(i - 1)!=list.get(i)) {
                list.remove(i - 1);
                list.remove(i - 1);
                flag = true;
            }
        return flag;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();




        System.out.println(java.util.Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH"})));


        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

}