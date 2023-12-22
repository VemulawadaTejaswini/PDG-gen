import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int array[] = new int[1000000];
		int i = 0;
		array[0] = num;
		
		do{
			if(array[i] % 2 == 0) {
				array[i+1] = array[i] / 2; 
			}else {
				array[i+1] = array[i] * 3 + 1;
			}
			i++;
		}while(!proc(array,array[i],i));
		
		System.out.println(i + 1);
	}
	
	public static boolean proc(int array[], int val, int len) {
		for(int i = 0; i < len; i++) {
			if(val == array[i]) {
				return true;
			}
		}
		return false;
	}
}
