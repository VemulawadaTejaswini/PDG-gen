import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()*100+sc.nextInt()*10+sc.nextInt();
		if(n%4==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		return;
	}
}