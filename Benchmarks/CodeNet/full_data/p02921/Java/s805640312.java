import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		String s=sc.next();
		String t=sc.next();

		String a[]=s.split("");
		String b[]=t.split("");


		int count=0;
		for(int i=0;i<3;i++){
			if(a[i].equals(b[i])){
				count++;
			}
		}

		System.out.println(count);


	}
}
