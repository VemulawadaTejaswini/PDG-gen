import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        
        for (int i = 1; i <= Z; i++) {
        	if (X < Y*i+(i+1)*Z) {
        		System.out.println(i-1);
        		return;
        	}
        }
        
        System.out.println(Y);
    }
    
}