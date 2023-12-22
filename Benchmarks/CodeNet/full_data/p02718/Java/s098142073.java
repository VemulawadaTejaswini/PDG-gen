import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{

	public static void main(String[] args){

		Scanner scan01 = new Scanner(System.in);
		int num01 = scan01.nextInt();

		Scanner scan02 = new Scanner(System.in);
		int num02 = scan02.nextInt();

		Scanner scan03 = new Scanner(System.in);

		Integer[] numbox = new Integer[num01];
		int sum = 0;
		for(int i=0; i<numbox.length; i++){
			numbox[i] = scan03.nextInt();
			sum = sum + numbox[i];
		}

		Arrays.sort(numbox, Collections.reverseOrder());

		int aaa = 0;
		for(int j=0; j<num02; j++){
			if(numbox[j]<sum/(4*num02)){
				aaa = aaa + 1;
				break;
			}else if(numbox[j]>sum/(4*num02)){
				aaa = aaa + 0;
			}
		}

		if(aaa>=1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

		scan01.close();
		scan02.close();
		scan03.close();

	}

}