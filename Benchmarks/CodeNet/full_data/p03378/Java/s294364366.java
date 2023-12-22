import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                m = sc.nextInt();
                int x = sc.nextInt();
                int[] a = new int[m];
                for(int i = 0 ; i < m ; i++){
                        a[i] = sc.nextInt();
                }
                sc.close();
                int yono = 0;
                int pct = 0;
                for(int i = 0 ; i < m ; i++){
                        if(a[i] < x){
                                yono++;
                        }else{
                                pct++;
                        }
                }
                System.out.println(Math.min(yono , pct));
        }
}
//鶏になれ
