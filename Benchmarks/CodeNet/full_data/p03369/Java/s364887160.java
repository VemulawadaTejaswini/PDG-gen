import java.util.*;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		char[] s=sc.next().toCharArray();
		String []ss=new String[3];
		int total=700;
		for(int i=0;i<3;i++){
			ss[i]=String.valueOf(s[i]);
		}
		for(int i=0;i<3;i++){
			if(ss[i].equals("o")){
				total+=100;
			}
		}
		System.out.println(total);


	}
}
