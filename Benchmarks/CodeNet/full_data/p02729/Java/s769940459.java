import java.util.Scanner;

public class Even_pairs {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int N= scan.nextInt();
        int M= scan.nextInt();
        int answer=0;
        if(N>=1) {
            answer = (N * (N - 1));
        }
        if(M>=1){
            answer+= (M*(M-1));
        }
        System.out.println(answer/2);
    }
}
