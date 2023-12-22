import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String rezult;
		rezult = "No";
		int aPlusbOfSuuti = Integer.parseInt(a + b);
		for(int num = 1;num <= 1000;num++){
			if(aPlusbOfSuuti == num*num){
				rezult = "Yes";
				break;
			}
		}
		System.out.println(rezult);
	}

}
