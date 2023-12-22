import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
		sc.close();
		if((s.contains("n") && !s.contains("s")) || (!s.contains("n") && s.contains("s")) || (s.contains("e") && !s.contains("w")) || (!s.contains("e") && s.contains("w"))){
            System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
        
	}
}
