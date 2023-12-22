import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String w[]=new String[n];
		char c[]= new char[10];
		char last[]=new char[10];
		w[0]=sc.next();

		boolean rule=true;

		for (int i=1;i<n && rule == true;++i){
			w[i]=sc.next();
			if (w[i-1].charAt(w[i-1].length()-1) == w[i].charAt(0));
			else rule = false;

			for (int j=0;j<i;++j){
				if (w[i].equals(w[j]) == true) rule = false;
			}
		}

		if (rule == true ) System.out.println("Yes");
		else System.out.print("No");
	}
}