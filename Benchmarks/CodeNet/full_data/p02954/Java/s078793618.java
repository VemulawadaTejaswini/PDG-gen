import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] table = a.split("");
		int[] numTable = new int[table.length];
		for(int i=0; i<numTable.length; i++) {
			numTable[i] = 1;
		}
		int right = 0;
		int current = 0; 
		for(int i=0; i<1000; i++) {
			for(int j=0; j<numTable.length;j++) {
              right = 0;
				current = numTable[j]-right;
				if(table[j].equals("R")) {
					numTable[j+1] += current;
					numTable[j] -= current;
					right = current;
				}else {
					numTable[j-1] += current;
					numTable[j] -= current;
					right = 0;
				}
			}
		}
		for(int result : numTable) {
			System.out.print(result + " ");
		}
	}
}