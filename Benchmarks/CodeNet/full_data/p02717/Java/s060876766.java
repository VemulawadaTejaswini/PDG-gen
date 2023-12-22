import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int list[] = new int[3];

		for (int i=0; i < 3; i++){
			list[i] = scan.nextInt();
		}

		int temp =0;
		temp = list[0];
		list[0] = list[1];
		list[1]  = temp;
		temp = list[0];
		list[0] = list[2];
		list[2] = temp;

		for (int i=0; i < 3; i++){
			if(i != 2)System.out.print(list[i] + " ");
			if(i == 2)System.out.print(list[i]);
		}
	}
}