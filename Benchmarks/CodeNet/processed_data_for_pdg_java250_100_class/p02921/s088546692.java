	import java.util.Scanner;
public class Main {
	public Main() {
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer,index;
		String s,t;
		s = sc.next();
		t = sc.next();
		sc.close();
		answer=0;
		for(index=0;index<3;index++) {
			if(s.substring(index,index+1).contentEquals(t.substring(index,index+1))) {
				answer=answer+1;
			}
		}
		System.out.print(answer);
	}
}
