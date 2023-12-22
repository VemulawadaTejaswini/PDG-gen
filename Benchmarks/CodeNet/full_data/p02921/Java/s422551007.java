import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int c = 0;
		/*
		if(s.charAt(0)==t.charAt(0)){
			c++;
		}
		if(s.charAt(1)==t.charAt(1)){
			c++;
		}
		if(s.charAt(2)==t.charAt(2)){
			c++;
		}
		*/
		
		for (int i=0;i<=2;i++){
			if(s.charAt(i)==t.charAt(i)){
				c++;
			}
		}
		
		System.out.println(c);
		
	}

}
