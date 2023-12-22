/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        abc121cEnergyDrinkCollectorSolve(n,m,a,b);
        sc.close();
    }

    public static void abc121cEnergyDrinkCollectorSolve(int n, int m, int[] a, int[] b) {
        long sum = 0;
        int numcount = 0;
        int ite = 0;
        boolean bool = true;
        Integer[] id = new Integer[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        Arrays.setAll(id, i -> i);
        Arrays.sort(id, Comparator.comparingInt(i -> a[i]));
        while(bool){
            if (numcount + b[id[ite]] < m) {
                sum += (long)b[id[ite]] * (long)a[id[ite]];
                numcount += b[id[ite]];
            } else {
                sum += (long)(m-numcount) * (long)a[id[ite]];
                bool = false;
            }
            ite++;
        }
        System.out.println(sum);
    }
}



