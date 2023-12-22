
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        if(N==1&&M==1){
            System.out.println(1);
        }else if(N==1||M==1){
            System.out.println(N+M-3);
        }else{
            System.out.println((N-2)*(M-2));
        }
    }
}
