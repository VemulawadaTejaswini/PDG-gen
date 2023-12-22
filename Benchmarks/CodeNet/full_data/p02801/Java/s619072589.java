import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		char[] pp = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char ch = sc.next();
		for( int i=0; i<26; i++ ){
			if( ch==pp ){
				System.out.println(pp[i+1]);
				break;
			}
		}
	}
}