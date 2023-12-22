import java.util.Scanner;

public class Main{
	
    public static void main(String[] agrs){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        System.out.println(a + b >= c ? "Yes" : "No");
    }
    
}