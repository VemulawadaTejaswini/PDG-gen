import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean isC=false,ok=false;
		String s=sc.next();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='C'){
				isC=true;
			}
			if(isC&&s.charAt(i)=='F'){
				ok=true;
			}
		}
		if(ok==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}