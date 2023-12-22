import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=sc.next();
		boolean ans=true;
		if(s.matches("[0-9].*-[0-9].*")){
		}else{
			ans=false;
		}

		if(s.substring(a,a+1).equals("-")){
		}else{
			ans=false;
		}

		if(ans==true){
			put("Yes");
		}else{
			put("No");
		}


  }

	public static void put(String n){
		System.out.println(n);
	}

}
