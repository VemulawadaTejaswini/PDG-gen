/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long w = sc.nextLong();
        long[] weight = new long[n];
        int[] value = new int[n];
        List<Integer> list0 = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextLong();
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (weight[i] - weight[0] == 0) {
                list0.add(value[i]);
            }
            if (weight[i] - weight[0] == 1) {
                list1.add(value[i]);
            }
            if (weight[i] - weight[0] == 2) {
                list2.add(value[i]);
            }
            if (weight[i] - weight[0] == 3) {
                list3.add(value[i]);
            }
        }

        int max = 0;
        Collections.sort(list0);
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);

        Collections.reverse(list0);
        Collections.reverse(list1);
        Collections.reverse(list2);
        Collections.reverse(list3);

        int[] list0ruiseki = new int[list0.size() + 1];
        int[] list1ruiseki = new int[list1.size() + 1];
        int[] list2ruiseki = new int[list2.size() + 1];
        int[] list3ruiseki = new int[list3.size() + 1];


        for (int i = 0; i < list0.size(); i++) {
            list0ruiseki[i + 1] = list0ruiseki[i] + list0.get(i);
        }
        for (int i = 0; i < list1.size(); i++) {
            list1ruiseki[i + 1] = list1ruiseki[i] + list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            list2ruiseki[i + 1] = list2ruiseki[i] + list2.get(i);
        }
        for (int i = 0; i < list3.size(); i++) {
            list3ruiseki[i + 1] = list3ruiseki[i] + list3.get(i);
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                for (int k = 0; k <= n - i - j; k++) {
                    for (int l = 0; l <= n - i - j - k; l++) {
                        if (i > list0.size() || j > list1.size() || k > list2.size() || l > list3.size()) {
                            continue;
                        }
                        else if( (i+j+k+l) * weight[0] + j + 2 * k + 3 * l > w){
                            continue;
                        }else {
                            max = Math.max(max, list0ruiseki[i] + list1ruiseki[j] +  
                                                    list2ruiseki[k] + list3ruiseki[l]);  
                        }
                    }
                }
            }
        }
        System.out.println(max);

        sc.close();
    }
    private static int gcd(int m, int n) {
        if(m < n) {
            return gcd(n, m);
        }
        if(n == 0){
            return m;
        } 
        return gcd(n, m % n);
    }
}