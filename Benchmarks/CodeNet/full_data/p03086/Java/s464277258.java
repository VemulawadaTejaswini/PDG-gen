import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int t=0;
		for(int i=0;i<s.length();i++){
		int f=0;
      if(s.charAt(i)=='A'||s.charAt(i)=='C'||s.charAt(i)=='G'||s.charAt(i)=='T'){
			for(int j=i+1;j<s.length();j++){
			if(s.charAt(j)=='A'||s.charAt(j)=='C'||s.charAt(j)=='G'||s.charAt(j)=='T')
				f++;
			else break;
			}
			if(t<f+1)
		t=f+1;
	}
	else continue;
		}
		System.out.println(t);
	}
}