

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int result = 0;
        int[] ball = inputval();
        int N = ball[0];
        int K = ball[1];
        int[] A = inputval();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++){
            if(!map.containsKey(A[i])) map.put(A[i],1);
            else map.put(A[i], map.get(A[i])+1);
        }
        //int minkey;
        //int mincount = Integer.MAX_VALUE;
        /*while(map.size() > K){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() < mincount){
                    minkey = entry.getValue();
                }
            }

            result++;

        }*/
        int c = 0;
        int i = 0;
        map.entrySet().stream().sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //System.out.println(entry.getKey()+" "+entry.getValue());
            i++;
            if(i > K) c += entry.getValue();
        }
        System.out.println(c);
    }
}