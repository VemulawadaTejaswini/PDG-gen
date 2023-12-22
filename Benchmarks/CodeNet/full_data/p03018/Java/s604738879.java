import java.util.*;
import java.lang.*;

class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String s = sc.next();
	while(s.contains("ABC")==true){
	s=s.replaceFirst("ABC","BCA");
	count+=1;
	}
    System.out.println(count);
	}
}