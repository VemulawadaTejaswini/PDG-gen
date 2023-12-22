import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] As = new int[9];
		for(int i=0; i<9;i++) {
			As[i]= sc.nextInt();
		}
		int b = sc.nextInt();
		ArrayList<Integer> Bs = new ArrayList<Integer>();
		for(int i=0; i<b;i++) {
			Bs.add(sc.nextInt());
		}
		boolean flag = false;
		if(Bs.contains(As[0]) && Bs.contains(As[1])&& Bs.contains(As[2])){
			flag=true;
		}else if(Bs.contains(As[3]) && Bs.contains(As[4])&& Bs.contains(As[5])){
			flag=true;
		}else if(Bs.contains(As[6]) && Bs.contains(As[7])&& Bs.contains(As[8])){
			flag=true;
		}else if(Bs.contains(As[0]) && Bs.contains(As[3])&& Bs.contains(As[6])){
			flag=true;
		}else if(Bs.contains(As[1]) && Bs.contains(As[4])&& Bs.contains(As[7])){
			flag=true;
		}else if(Bs.contains(As[2]) && Bs.contains(As[5])&& Bs.contains(As[8])){
			flag=true;
		}else if(Bs.contains(As[0]) && Bs.contains(As[4])&& Bs.contains(As[8])){
			flag=true;
		}else if(Bs.contains(As[2]) && Bs.contains(As[4])&& Bs.contains(As[6])){
			flag=true;
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
