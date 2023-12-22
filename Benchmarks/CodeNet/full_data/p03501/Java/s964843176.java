import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int ans=A*N;
        if(ans>B){
            System.out.println(B);
        }
        else{
            System.out.println(ans);
    }
}
}