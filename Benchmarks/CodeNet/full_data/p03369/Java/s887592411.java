import java.util.*;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		char[] s=sc.next().toCharArray();
		int total=700;

		for(int i=0;i<3;i++){
			if(s[i]=='o'){
				total+=100;
			}
		}
		System.out.println(total);


	}
}
