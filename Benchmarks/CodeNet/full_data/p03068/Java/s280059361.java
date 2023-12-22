import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
 
        int K = sc.nextInt();
 
        char c = S.charAt(K-1);
 
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            char c2  = S.charAt(i);
 
            if(c2 != c ){
                sb.append("*");
            }else{
                sb.append(c2);
            }
        }
 
        System.out.println(sb.toString());
    }
 
}