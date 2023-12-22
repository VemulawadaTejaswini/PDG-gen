import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		List<Character> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		for(int i = 0; i < N; i++){
			String a = sc.next();
			if(list2.contains(a)){
				System.out.println("No");
				return;
			}
			list1.add( a.charAt(0));
			list1.add( a.charAt(a.length() - 1));
			list2.add(a);
		}
		for(int i = 1; i <= 2*(N-1)-1; i +=2){
				if(list1.get(i) != list1.get(i+1)){
					System.out.println("No");
					return;
				}
		}
		System.out.println("Yes");	
	}
}