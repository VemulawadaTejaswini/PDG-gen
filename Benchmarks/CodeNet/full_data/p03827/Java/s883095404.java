import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.nextLine();
		sc.close();

		int x = 0,xMax = 0;
		for(int i=0;i<n;i++){
			char c = s.charAt(i);
			switch(c){
			case 'I':{
				x++;
				break;
			}
			case 'D':{
				x--;
			}
			}
			xMax = Math.max(xMax, x);
		}
		System.out.println(xMax);

	}

}