import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long n = sc.nextLong();//s型
		long m = sc.nextLong();//c型
		long count=0;
		for(;;) {
			if(0<n) {
				n--;
			}else if(m<4){
				break;
			}else{
				m=m-2;
			}
			if(m<2)break;
			m=m-2;
			count++;
			}
		System.out.println(count);

	}

}
