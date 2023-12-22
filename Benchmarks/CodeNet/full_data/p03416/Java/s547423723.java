import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a; i < b; i++){
			String num = Integer.toString(i);
			char[] copy = Arrays.copyOf(num.toCharArray(), num.length()/2);
			num = num.substring(num.length() % 2 == 0 ? num.length()/2 : num.length()/2 + 1);
			char[] array = num.toCharArray();
			int j = 0;
			while(j < array.length){
				if(copy[j] != array[j]) break;
				j++;
			}
			if(j == array.length) count++;
		}
		System.out.println(count);
	}
}