import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String strStdIn = in.readLine();
        int n = Integer.parseInt(strStdIn);
        String[] data = in.readLine().split(" ");
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < data.length; i++) {
            list.add(Integer.parseInt(data[i]));
        }
        
        int sum = 0;
        
        for(int l = 0; l < n - 1; l++) {
            for (int r = l + 1; r < n; r++) {
                 List<Integer> temp = list.subList(l, r+1);
                 ArrayList<Integer> sublist = new ArrayList<Integer>(temp);
                 Collections.sort(sublist, Collections.reverseOrder());
                 sum += sublist.get(1);
            }
        }
        
        
        System.out.println(sum);
    }
}