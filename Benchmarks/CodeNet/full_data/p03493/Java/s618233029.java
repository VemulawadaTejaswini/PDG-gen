import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String s[]=new String[3];
		int count=0;
		s=a.split("");
		for(int i=0;i<3;i++){
			if(s[i].equals("1")){
				count++;
			}
		}

		System.out.println(count);

	}
}
