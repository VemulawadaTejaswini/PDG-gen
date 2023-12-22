import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] m = new int[n];
                int yono = 0;
                for(int i = 0 ; i < n ; i++){
                        yono++;
                        m[i] = sc.nextInt();
                        x -= m[i];
                }
                sc.close();
                Arrays.sort(m);
                yono += x / m[0];
                System.out.println(yono);
        }
}//0=48
//鶏になれ