import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用 int
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    // 標準入力数値リスト用 int
    static List<Integer> inputIntList() throws Exception {
        List<String> strList = Arrays.asList(br.readLine().trim().split(" "));
        List<Integer> intList = new ArrayList<Integer>();
        for (String elem : strList){
            intList.add(Integer.parseInt(elem));
        }
        return intList;
    }

    // 標準入力数値配列用 integer 降順ソート用
    static Integer[] inputvalInteger() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        Integer[] intarray = new Integer[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /*標準入力long*/
    static long inputLong() throws Exception {
        return Long.parseLong(br.readLine());
    }
    static int ansW = 0;
    static int ansS = 0;
    static float maxRate = 0;

    static void calRate(int water, int sugar,int maxSugar,int f) throws Exception{
        for(int k=sugar; k/(water/100)<=maxSugar && (k+water) <=f;k+=sugar){
            if (k*100 /(water + k) > maxRate){
                ansW = water;
                ansS = k;
            }
            maxRate = Math.max(k*100 /(water + k),maxRate);

        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int [] inputVal = inputval();
        int a = inputVal[0] * 100;
        int b = inputVal[1] * 100;
        int c = inputVal[2];
        int d = inputVal[3];
        int e = inputVal[4];
        int f = inputVal[5];



        for (int i = 0; i<=f; i+=a){
            for(int j=0; j<=f; j+=b){
                if (i==0 && j==0){
                    continue;
                }
                int water = i+j;
                calRate(water,c,e,f);
                calRate(water,d,e,f);
                calRate(water,c+d,e,f);

            }
        }



        System.out.println(ansW+ansS + " " + ansS);



    }

}

