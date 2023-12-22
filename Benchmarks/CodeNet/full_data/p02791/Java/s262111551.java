import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getInput().get(0);
        ArrayList<Integer> p = package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getInput().get(0);
        ArrayList<Integer> p = getInput();

        int count = 0;
        for (int i = 0; i < p.size(); i++) {
            List<Integer> cut = p.subList(0, i);
            
            int max;
            if (cut.size() == 0) {
                ++count;
                continue;
            } else if (cut.size() == 1) {
                max = cut.get(0);
            } else {
                max = cut.stream().min(Comparator.naturalOrder()).get();
            }
            
            if (p.get(i) <= max) ++count;
        }

        Print(count);
    }

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Integer> getInput() {
        String in = scanner.nextLine();

        ArrayList<Integer> result = new ArrayList<>();
        for (String t : in.split(" ")) {
            result.add(Integer.parseInt(t));
        }

        return result;
    }

    private static void Print(Object o) {
        System.out.println(o);
    }

    private static void Print(Object... o) {
        for (Object i : o) System.out.print(i);
        System.out.println();
    }
}
getInput();

        int count = 0;
        for (int i = 0; i < p.size(); i++) {
            List<Integer> cut = p.subList(0, i);
            
            int max;
            if (cut.size() == 0) {
                ++count;
                continue;
            } else if (cut.size() == 1) {
                max = cut.get(0);
            } else {
                max = cut.stream().min(Comparator.naturalOrder()).get();
            }
            
            if (p.get(i) <= max) ++count;
        }

        Print(count);
    }

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Integer> getInput() {
        String in = scanner.nextLine();

        ArrayList<Integer> result = new ArrayList<>();
        for (String t : in.split(" ")) {
            result.add(Integer.parseInt(t));
        }

        return result;
    }

    private static void Print(Object o) {
        System.out.println(o);
    }

    private static void Print(Object... o) {
        for (Object i : o) System.out.print(i);
        System.out.println();
    }
}
