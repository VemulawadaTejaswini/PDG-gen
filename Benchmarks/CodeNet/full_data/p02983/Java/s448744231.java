import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int L=sc.nextInt();
	int R=sc.nextInt();
	sc.close();

	int min=0;
	if(L%2019>1009) {
		min=2019-L%2019;
	}else {
		min=L%2019;
	}
	for(int i=L+1;i<R;i++) {
		if(i%2019<min) {
			if(L%2019>1009) {
				min=2019-L%2019;
			}else {
				min=L%2019;
			}
		}
	}
	System.out.println(min*(min+1)%2019);
}
}