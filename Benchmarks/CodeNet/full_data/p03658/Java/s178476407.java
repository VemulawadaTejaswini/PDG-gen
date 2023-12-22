import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                }
                sc.close();
                Arrays.sort(a);
                int yono = 0;
                for(int i = n - k ; i < n ; i++){
                        yono += a[i];
                }
                System.out.println(yono);
        }
}
//今日は部活があります