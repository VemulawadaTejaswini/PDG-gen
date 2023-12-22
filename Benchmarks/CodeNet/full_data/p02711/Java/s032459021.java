import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String N = sc.next();
	boolean result = false;
	for(int i=0;i<3;i++){
	    if(Character.getNumericValue(N.charAt(i)) == 7) result = true;
	}
	if(result) System.out.print("Yes");
	else System.out.print("No");
    }
}