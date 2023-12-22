import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);

	long A=sc.nextLong();
	long B=sc.nextLong();
	long K=sc.nextLong();
	if(K>A) {
		K-=A;
		A=0;
		if(K>B) {
			B=0;
		}else {
			B-=K;
		}
	}else {
		A-=K;
	}
	System.out.println(A+" "+B);

	}
}