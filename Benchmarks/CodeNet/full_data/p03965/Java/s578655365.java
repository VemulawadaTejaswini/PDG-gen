import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int g=0;
		int ans=0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='g' && g>0){
				g--;
				ans++;
			}else if(s.charAt(i)=='p'){
				if(g>0){
					g--;
				}else{
					ans--;
					g++;
				}
			}else{
				g++;
			}
		}
		System.out.println(ans);
	}
}
