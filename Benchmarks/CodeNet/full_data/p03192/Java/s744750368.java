import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String N = sc.nextLine();

        System.out.println(N.length() - N.replaceAll("2", "").length());
    }
}	