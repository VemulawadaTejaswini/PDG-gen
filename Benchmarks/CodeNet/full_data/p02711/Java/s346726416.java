import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String  N = sc.next();

	boolean ch =false;
		for(int i=0; i<3; i++){
		if(N.charAt(i)== '7'){
			ch=true;
			break;
    }
    }
	if(ch){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}