import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
         
        HashMap<String,Integer> hm = new HashMap<>();
        
        int n1 = scan.nextInt();
        
        
        int[] arr = new int[n1];
        int index = 0;
        
        while(n1-- > 0){
            String temp = scan.next();
            if(hm.containsKey(temp)){
                arr[hm.get(temp)]++;
            }
            else{
                hm.put(temp,index);
                arr[index]++;
                index++;
            }
        }
        
        int n2 = scan.nextInt();
        while(n2-- > 0){
            String temp = scan.next();
            if(hm.containsKey(temp)){
                arr[hm.get(temp)]--;
            }
        }
        
        int max = 0;
        for(int i : arr){
            max = max > i ? max : i;
        }
        
        System.out.println(max);
    }
}
