import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		if(n % 100 % 10 == 7){
		    System.out.println("Yes");
		}else if(n % 100 / 10 == 7){
		    System.out.println("Yes");
		}else if(n / 100 == 7){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
        
    }
}