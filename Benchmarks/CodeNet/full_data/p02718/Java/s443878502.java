import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);

	int n=scanner.nextInt();
	int i=scanner.nextInt();
	Integer[] m=new Integer[n];
	int t=0;


	for(int j=0;j<n;j++) {
		int a=scanner.nextInt();
		m[j]=a;
	}

	for(int j=0;j<n;j++) {
		t=t+m[j];
	}
	System.out.println(t);
	Arrays.sort(m,Collections.reverseOrder());
	System.out.println(m[0]+""+m[1]);
	int g=4*i;
	if(m[i-1]*g<t) {
	System.out.println("No");
	}
	else {
		System.out.println("Yes");
	}


	 }
}