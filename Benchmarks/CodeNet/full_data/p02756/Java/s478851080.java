import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int q=sc.nextInt();
		StringBuilder sb=new StringBuilder(s);
		boolean ch=true;
		for(int i=0; i<q; i++){
			int t=sc.nextInt();
			if(t==1){
				ch=!ch;
			}else{
				int f=sc.nextInt();
				char c=sc.next().charAt(0);
				if(f==1){
					if(ch){
						sb.insert(0,c);
					}else{
						sb.append(c);
						
					}
				}else{
					if(ch){
						
						sb.append(c);
					}else{
						sb.insert(0,c);
					}
				}
			}
		}
		if(!ch){
			sb.reverse();
		}
		System.out.println(sb);
	}
}
