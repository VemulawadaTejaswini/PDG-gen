import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
        int s = 0;
		int t = 0;
        for(int i=0;i<str.length();i++){if(s.charAt(i)=='T'){t++;} 
                                        else{break;}
                                       }
        for(int i=str.length()-1;i>=0;i--){if(s.charAt(i)=='S'){s++;} 
                                           else{break;}
                                          }
		System.out.println(Math.max(2*s,2*t);
	}
}