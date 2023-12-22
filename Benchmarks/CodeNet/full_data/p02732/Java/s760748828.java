import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hiral {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Long> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a[i] = num;
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1L);
            }
        }

        long total = 0;
        for(Map.Entry<Integer, Long> entry : hashMap.entrySet()){
            total += (entry.getValue()*(entry.getValue()-1))/2;
        }

        //System.out.println(hashMap);
        //System.out.println(total);

        for (int num: a){
            System.out.println(total - (hashMap.get(num)) + 1);
        }

    }
}


/*

5
1 1 2 1 2

counter =>  key      value
             1   ->    3
             2   ->    2

long total = 0

total += 3;
total = 3
total += 1;
total = 4;

1st ball is 1
remaining balls 1 2 1 2
print => total - (hashMap.get(1)) + 1
            4 - 3 + 1 = 2
            
3rd ball is 2 
remaining balls 1 1 1 2
            total - hashMap.get(2) + 1
            4 - 2 + 1 = 3
            
          
 */