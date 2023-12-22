import java.util.Arrays;
import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = splitInt(sc.nextLine(), " ");
		int result;
		if(array[0]<=5) {
			result = 0;
		}else if(array[0]<=12) {
			result = array[1]/2;
		}else {
			result = array[1];
		}
		System.out.println(result);
		
	}
	public static int[] splitInt(String str, String split) {
		String[] array = str.split(split);
		int[] array2 = new int[array.length];
	
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		return array2;
	}
}