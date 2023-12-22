import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int d = Integer.parseInt(input[0]);
        int g = Integer.parseInt(input[1]);
        
        int[] p_i = new int[d];
        int[] c_i = new int[d];
        int maxBit = 0;
        for(int i=0; i<d; i++){
            String[] pandc = br.readLine().split(" ");
            p_i[i] = Integer.parseInt(pandc[0]);
            c_i[i] = Integer.parseInt(pandc[1]);
            maxBit += p_i[i];
        }
        
        List<Integer> list = new ArrayList<>();
        int check = 0;
        for(int i = 0; i < p_i.length / 2 + 1; i++){
            check += p_i[i] * 100 * (i + 1) + c_i[i];
        }
        for(int i = 0; i < Math.pow(2, maxBit); i++){
            int count = 1;
            int total = 0;  int j = 0;  int allClearFlag = 0;
            int acNumber = 0;
            for(int bit = i; bit > 0; bit = bit >> 1){
                if((bit & 1) == 1){
                    total += 100 * count;
                    allClearFlag++;
                    acNumber++;
                }
                j++;
                if(j == p_i[count - 1]){
                    if(allClearFlag == p_i[count - 1]){
                        total += c_i[count - 1];
                    }
                    count++;
                    j = 0;
                    allClearFlag = 0;
                }
            }
            if(total >= g) list.add(acNumber);
        }
        
        list.sort((a, b) -> a - b);

        System.out.println(list.get(0));
    }
}
