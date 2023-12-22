import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
		sc.close();
		if((s.contains("N") && !s.contains("S")) || (!s.contains("N") && s.contains("S")) || (s.contains("E") && !s.contains("W")) || (!s.contains("E") && s.contains("W"))){
            System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
        
	}
}
