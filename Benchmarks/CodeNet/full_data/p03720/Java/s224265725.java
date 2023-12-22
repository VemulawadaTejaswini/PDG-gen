import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[M];
        int b[] = new int[M];
        
        for(int i=0; i<M; i++){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        
        HashMap<String, Integer> cnt = new HashMap<String, Integer>();
        for(int i=0; i<M; i++){
        cnt.put(a[i], 0);
        cnt.put(b[i], 0);
        }
        
        for(int i=0; i<M; i++){
        cnt.put(a[i], cnt.get(a[i])+1);
        cnt.put(b[i], cnt.get(b[i])+1);
        }
        
        for(int i=0; i<; i++){
            System.out.println(cnt.get[i]);
        }
        
    }
}