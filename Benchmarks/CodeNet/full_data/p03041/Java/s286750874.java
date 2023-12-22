import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        char[] c = new char[N];
        for(int i = 0; i < N; i++){
            char tmp = S.charAt(i);
            if(i == K - 1){
                tmp += 32;
            }
            System.out.print(tmp);
        }
        System.out.println();
        
    }
}