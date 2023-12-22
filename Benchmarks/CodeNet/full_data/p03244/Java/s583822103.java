import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(i%2 == 0){
                if(mp1.containsKey(num)) mp1.put(num, mp1.get(num) +1);
                else mp1.put(num,1);
            }
            else{
                if(mp2.containsKey(num)) mp2.put(num, mp2.get(num) +1);
                else mp2.put(num,1);
            }
        }
        int max = 0;
        for(int value : mp1.values()){
            if(value > max) max = value;
        }
        int sum = n/2 - max;
        max = 0;
        for(int value : mp2.values()){
            if(value > max) max = value;
        }
        sum += n/2 - max;
        System.out.println(sum);
    }
}