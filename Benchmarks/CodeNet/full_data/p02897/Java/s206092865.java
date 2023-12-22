import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==0){
            System.out.println("0.5");
        }else{
            System.out.println(N/((N+1)/2));
        }
    }
}
