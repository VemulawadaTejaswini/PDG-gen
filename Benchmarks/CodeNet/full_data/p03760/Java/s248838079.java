import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String O=s.nextLine();
		String E=s.nextLine();
	
		int i=0;
		
		for(i=0;i<O.length()+E.length();i++){
			if(i%2==1)System.out.print(O.charAt(i/2));
			else System.out.print(E.charAt(i/2));
		}

	}

}