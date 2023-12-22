import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int P = sc.nextInt();

		int pa = A*3+P;
		int a_pie = 0;

		if(pa<3){
			a_pie = 0;
		}else if(pa%2==0){
			a_pie = pa/2;
		} else if(pa%2==1){
			a_pie = (pa-1)/2;
		}

		System.out.println(a_pie);

	}

}
