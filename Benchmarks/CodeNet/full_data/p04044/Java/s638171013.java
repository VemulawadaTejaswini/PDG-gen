import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int l =sc.nextInt();
		String temp="";
		
		String [] s = new String[n];
		s[0]=sc.nextLine();
		for(int i=0 ; i<n ; i++) {
			s[i]=sc.nextLine();
		}
		
		for(int i = 0; i<n ; i++ ) {
			for(int j=0 ; j<n ; j++) { 
				if(s[i].compareTo(s[j])<0) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i = 0 ; i<n ; i++)
			System.out.print(s[i]);
		
		
		sc.close();

	}

}