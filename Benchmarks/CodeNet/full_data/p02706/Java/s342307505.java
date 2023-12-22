import java.util.*;
class Main {
public static void main(String []args) {
	Scanner sc = new Scanner (System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[]=new int [m];
	for(int i=0;i<m;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<m;i++) {
		n=n-arr[i];
	}
	if(n>=0) {
		System.out.println(n);
	}
	else {
		System.out.println("-1");
	}
}
}
