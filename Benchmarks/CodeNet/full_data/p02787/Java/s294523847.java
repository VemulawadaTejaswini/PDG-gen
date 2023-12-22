//package com.questetra.test.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static M[] magics;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        magics = new M[N];
        int minConsume = Integer.MAX_VALUE;
        int maxAtack = 0;
        for (int i = 0; i < N; i++) {
            M m = new M();
            m.atack = sc.nextInt();
            m.consume = sc.nextInt();
            minConsume = Math.min(minConsume, m.consume);
            maxAtack = Math.max(maxAtack, m.atack);
            sc.nextLine();
            magics[i] = m;
        }
        Arrays.sort(magics, Comparator.comparingDouble(M::ratio).reversed());

        int sum = 0;
//        while (H > maxAtack * 2) {
//            H -= magics[0].atack;
//            sum += magics[0].consume;
//        }
        sum = attack(0, H, sum, Integer.MAX_VALUE);
        System.out.println(sum);
    }

    static class M {
        int atack;
        int consume;

        float ratio() {
            return ((float) atack) / consume;
        }
    }

    static int attack(int index, int H, int sum, int currentMinSum) {
        for (int i = index; i < magics.length; i++) {
            H -= magics[index].atack;
            sum += magics[index].consume;
            if (currentMinSum < sum) {
                // 打ち切り
                continue;
            }
            if (H > 0) {
                sum = attack(index, H, sum, currentMinSum);
            }
            currentMinSum = Math.min(currentMinSum, sum);
        }
        return currentMinSum;
    }
}