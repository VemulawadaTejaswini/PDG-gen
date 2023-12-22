import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
			double t = sc.nextDouble();
			double x = sc.nextDouble();
			System.out.println(t / x);
		}
    }
}
