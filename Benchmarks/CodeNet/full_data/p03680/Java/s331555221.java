import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            map.put(i+1, a[i]);
        }
        sc.close();

        int[] b = new int[N];

        int key = 1;
        int count = 0;
        while(true){
            if(b[key-1] != 1)
                b[key-1] = 1;
            else
                break;
            key = map.get(key);
            count++;
            if(key == 2){
                System.out.println(count);
                return;
            }
        }
        System.out.println(-1);
    }
}