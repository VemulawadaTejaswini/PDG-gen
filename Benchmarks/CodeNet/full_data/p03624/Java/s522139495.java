import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//String array[] = str.split("");
		char[] array = str.toCharArray();
		char[] chara = new char[26];
		int count[] = new int[26];
		int i = 0;
		char c = 97;
				
		while(i < 26) {
			chara[i]  = c;
			
			c++;
			i++;
		}
		//Arrays.sort(array);
		//count[0] = Integer.parseInt(array[0]);
		//System.out.println(count[0]);
		//int chara = 0;
		i = 0;
		while(i < array.length){
			//System.out.println((int)array[i]);
			count[((int)array[i]-97)]++;
			//System.out.println(count[i]);
			//System.out.println(count[i]);
			i++;
		}
		
		i = 0;
		c = 97;
		while(i < 26){
			
			//System.out.println(count[array[i]]);
			//System.out.println(c + " " + count[i]);
			c++;
			i++;
		}
		
		i=0;
		while(i < 26){
			//System.out.println(count[i]);
			if(count[i] == 0){
				System.out.println(chara[i]);
				break;
			}
			else if(i == 25){
				System.out.println("None");
			}
			i++;
		}
		
		/*int i = 0;
		String count[] = new String[N];
		while(i < str_array.length) {;
			count[str_array[i] - 'a']++;
			i++;
		}

		int j = 0;
		while(j < 26){
			if(count[j] == 0){
				System.out.print(count[j]);
			j++;
		}
		System.out.println("");*/

	}

}