import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
		int str2 = sc.nextInt();
		if(str1 == 1 || str1 == 3|| str1 == 5|| str1 == 7|| str1 == 8|| str1 == 10|| str1 == 12){
			str1 = 100;
		}
		if(str1 == 4 ||str1 == 6 ||str1 == 9 ||str1 == 11) str1 = 200;
		if(str1 == 2) str1 = 300;
		
		if(str2 == 1 || str2 == 3|| str2 == 5|| str2 == 7|| str2 == 8|| str2 == 10|| str2 == 12){
			str2 = 100;
		}
		if(str2 == 4 ||str2 == 6 ||str2 == 9 ||str2 == 11) str2 = 200;
		if(str2 == 2) str2 = 300;
		
		if(str1 == str2) System.out.println("Yes");
		if(str1 != str2) System.out.println("No");
	  }
	}