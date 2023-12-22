import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        int ans=A+B;
        if(ans<A-B){
            ans=A-B;
        }
        if(ans<A*B){
            ans=A*B;
        }
        System.out.println(ans);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    }
}
