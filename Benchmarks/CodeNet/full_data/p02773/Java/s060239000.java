import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] array = new String[n];
		int[] iarray = new int[n];
		sc.nextLine();
		for(int i = 0;i < n;i++){
			array[i] = sc.nextLine();
		}
		Arrays.sort(array);
int count = 0;
int max = 0;
		for(int i = 0;i < n-1;i++){
			if(array[i].equals(array[i+1])){
				count++;
				iarray[i] = count;
				if(i == n-2 && max < count){
					max = count;
				}
			}else{
				if(max < count){
					max = count;
				}
				count = 0;
				iarray[i] = count;
			}
		}

		for(int i = 0;i < n;i++){
			if(iarray[i] == max){
				System.out.println(array[i]);
			}
		}

		}
}