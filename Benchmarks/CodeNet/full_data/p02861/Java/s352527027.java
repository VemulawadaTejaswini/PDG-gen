import java.util.*;
import java.util.Scanner;

public class Main {
    static int j = 0;
    static String con_str[];
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X[] = new int[N];
        int Y[] = new int[N];
        for(int i = 0;i < N;i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        String S = "01234567".substring(0,N);
        int con = 1;
        for(int i = 0;i < N;i++){
            con = con * (i + 1);
        }
        con_str = new String[con];
        permutation(S, "");
        
        double sum = 0;
        for(int i = 0;i < con;i++){
            for(int c = 0;c < N-1;c++){
                int x = X[Integer.parseInt(con_str[i].substring(c,c+1))] - X[Integer.parseInt(con_str[i].substring(c+1,c+2))];
                int y = Y[Integer.parseInt(con_str[i].substring(c,c+1))] - Y[Integer.parseInt(con_str[i].substring(c+1,c+2))];
                sum += Math.sqrt(x*x + y*y);
            }
        }
        
        System.out.println(sum / con);
    }
    
    public static void permutation(String q, String ans){
        if(q.length() <= 1) {
            con_str[j] = ans + q;
            j++;
        }
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}
