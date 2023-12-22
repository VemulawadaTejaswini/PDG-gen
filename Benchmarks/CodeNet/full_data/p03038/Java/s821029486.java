import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = splitInt(sc.nextLine(), " ");
		int[] table = splitInt(sc.nextLine(), " ");
		Arrays.sort(table);
		
		int[][] array2 = new int[2][first[1]];
		for(int i=0; i<first[1];i++) {
			int[] array = splitInt(sc.nextLine(), " ");
			array2[0][i] = array[0];
			array2[1][i] = array[1];
			i++;
		}
		for(int i=0; i<first[1]; i++) {
			int d = 0;
			int n=0;
			for(; n<array2[0][i] ;n++) {
				if(array2[1][i]>table[d]) {
					table[d] = array2[1][i];
					d++;
				}else {
					break;
				}
			}
			if(n==array2[0][i]) {
				Arrays.sort(table);
			}
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