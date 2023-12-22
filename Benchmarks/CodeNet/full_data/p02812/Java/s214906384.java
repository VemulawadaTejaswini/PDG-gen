import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] sarray = s.split("");
		int count = 0;

		for(int i = 0;i<n-2;i++){
			if(sarray[i].equals("A")&&sarray[i+1].equals("B")&&sarray[i+2].equals("C")){
				count++;
			}
		}
		System.out.println(count);
	}
}