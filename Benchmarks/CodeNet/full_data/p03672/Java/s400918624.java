import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String N = sc.next();
	String kakera = "";
	int max_length = 0;
	for(int i = 2;i < N.length();i += 2){
		kakera = N.substring(0,i);
		if(kakera.substring(0,i/2).equals(kakera.substring(i/2,i))){
			max_length = i;
		}		
	}
	System.out.println(max_length);
	}
}
	
