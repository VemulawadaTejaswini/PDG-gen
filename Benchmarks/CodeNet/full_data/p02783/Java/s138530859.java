import java.util.*;
import java.io.*;
public class Main
{
	
public static void main(String[]args) throws IOException{
	Scanner sc =new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int sum = A;
	int count = 0;
	while(true) {
		count++;
		sum = sum -B;
		if(sum <=0) {
			break;
		}
	}
	System.out.println(count);
}
}