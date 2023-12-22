import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] price = new int[3];
	for(int i = 0; i < 3; i++){
	    price[i] = scan.nextInt();
	}

	Arrays.sort(price);
	System.out.println(price[0]+price[1]);
    }
}
