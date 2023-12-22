import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] arrayO = sc.next().split("");
		String[] arrayE = sc.next().split("");

		for (int i=0;i<arrayE.length;i++) {
			System.out.print(arrayO[i]);
			System.out.print(arrayE[i]);
		}
		
		if (arrayO.length != arrayE.length){
			System.out.print(arrayO[arrayO.length-1]);
		}

	}
}