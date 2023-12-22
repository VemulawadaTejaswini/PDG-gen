import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                int yono = 0;
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                        yono += Math.min(a[i] , k - a[i]);
                }
                sc.close();
                System.out.println(2 * yono);
        }
}
//地味に部屋が暑いです
//LaTex難しくないですか？