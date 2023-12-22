import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = x + a;
        if( b > sum){
            System.out.println("dangerous");
        }else if(b > a){
            System.out.println("safe");
        }else{
            System.out.println("delicious");
        }
	}
}