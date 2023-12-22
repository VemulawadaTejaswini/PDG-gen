import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        int rem = 0;
        while(m != 0){
            rem = m % 10;
            sum = sum + rem;
            m = m / 10;
        }
        if((n % sum) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}