import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.List;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int n = sc.nextInt();
        ArrayList<Integer> d = new ArrayList<>();
        for (int i=0;i<n;i++){
            d.add(sc.nextInt());
        }
        Collections.sort(d);
        int len = d.size();
        int left = d.get(len/2-1);
        int right = d.get(len/2);
        int ans = right - left;
        System.out.println(ans);
    }
}

class Library{
    static long a;
    static long b;

    public static long gcd(long a,long b){
        Library lib = new Library();
        if (a<b){
            lib.swap(a,b);
        }
        if (b==0){
            return a;
        } else {
            return gcd(b,a%b);
        }
    }

    public static void swap(long a,long b){
        long x = a;
        a = b;
        b = x;
        return;
    }
}