import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='7'){
				count++;
			}
		}
		
		if(count>0)	System.out.println("Yes");
		else 	System.out.println("No");
	}
}