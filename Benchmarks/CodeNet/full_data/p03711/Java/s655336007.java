import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = {1,3,5,7,8,10,12};
		int[] b = {4,6,9,11};
		int c = 2;
		int aCount = 0,bCount = 0,cCount = 0;
		int x = scanner.nextInt(),y = scanner.nextInt();
		if(Arrays.asList(a).contains(x)){
			aCount++;
		}else if(Arrays.asList(b).contains(x)){
			bCount++;
		}else if(c == x){
			cCount++;
		}
		if(Arrays.asList(a).contains(y)){
			aCount++;
		}else if(Arrays.asList(b).contains(y)){
			bCount++;
		}else if(c == y){
			cCount++;
		}
		if(aCount == 2 || bCount == 2 || cCount == 2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
