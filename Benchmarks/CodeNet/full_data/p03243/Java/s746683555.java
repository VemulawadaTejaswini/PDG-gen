import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i = 1; i <10; i++){
            if(N <= 111 * i){
                System.out.println(111 * i);
                break;
            }
        }

    }

}
