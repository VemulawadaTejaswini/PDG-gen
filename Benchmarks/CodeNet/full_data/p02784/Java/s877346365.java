import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            H -= sc.nextInt();
        }
        if(H > 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}
