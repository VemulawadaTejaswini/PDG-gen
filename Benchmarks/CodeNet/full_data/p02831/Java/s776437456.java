import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long answer = (long)Math.max(a,b);
        
        while(answer%a!=0 || answer%b!=0){
            answer++;
        }
        
        System.out.println(answer);
    }
}