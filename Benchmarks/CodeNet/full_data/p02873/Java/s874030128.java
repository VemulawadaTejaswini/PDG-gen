import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		String s = sc.next();
        int [] l = new int [s.length()];
        int [] r = new int [s.length()];        
        for(int i=0;i<s.length();i++){if(s.charAt(i)=='<'){l[i+1]=l[i]+1;}
                                     }
        for(int i=s.length()-1;i>=0;i--){if(s.charAt(i)=='>'){r[i]=r[i+1]+1;}
                                        }
        for(int i=0;i<s.length();i++){ans+=Math.max(l[i],r[i]);}      
		System.out.println(ans);
	}
}