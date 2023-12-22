import java.util.Arrays;
import java.util.Scanner;
 
import javax.naming.spi.DirStateFactory.Result;
 
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = splitInt(sc.nextLine(), " ");
		int[] table = splitInt(sc.nextLine(), " ");
		Arrays.sort(table);
		
		int[][] array2 = new int[2][first[1]];
		int c=0;
		while(sc.hasNext()){
			int[] array = splitInt(sc.nextLine(), " ");
			array2[0][c] = array[0];
			array2[1][c] = array[1];
			c++;
		}
		for(int i=0; i<first[1]; i++) {
			int d = 0;
			for(int n=array2[0][i]; n>0 ;n--) {
				if(array2[1][i]>table[d]) {
					table[d] = array2[1][i];
					d++;
				}else {
					break;
				}
			}
			Arrays.sort(table);
		}
		int result = 0;
		for(int a:table) {
			result+=a;
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