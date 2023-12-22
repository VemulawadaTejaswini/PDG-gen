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

    public static void main(String[] args) throws Exception {
        // write your code here
        int [] intarray = inputval();
        int w = intarray[0];
        int h = intarray[1];
        int n = intarray[2];
        int stx = 0;
        int endx = w;
        int sty = 0;
        int endy = h;

        for (int i=0; i<n; i++){
            int [] xya = inputval();
            int x = xya[0];
            int y = xya[1];
            int a = xya[2];
            if(a == 1){
                stx = Math.max(stx, x);
            }else if (a == 2){
                endx = Math.min(endx, x);
            }else if (a == 3){
                sty = Math.max(sty, y);
            }else{
                endy = Math.min(endy,y);
            }
        }

        System.out.println(Math.max(endx-stx,0) * Math.max(endy-sty,0));

    }

}

