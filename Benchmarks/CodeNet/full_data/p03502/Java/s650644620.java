import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc. nextInt();
  	int n = N;
	int sum = 0; 
	String a = "No";
	while(n > 0) {
		sum += n % 10;
		n /= 10;
	}
	if(N % sum == 0) {
		a = "Yes";
	}
	System.out.println(a);
}
}
