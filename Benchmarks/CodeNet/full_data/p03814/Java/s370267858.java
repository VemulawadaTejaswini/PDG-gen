import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca=new Scanner(System.in);
		String s=sca.next();
		int i=0,j=0;
		int count1=0;
		int count2=0;
		
		for(i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				count1=i;
				break;
			}
		}
		for(i=count1;i<s.length();i++){
			if(s.charAt(i)=='Z'&&count2<i-count1){
				count2=i-count1;
			}
		}
		
		System.out.print(count2+1);
		

	}

}