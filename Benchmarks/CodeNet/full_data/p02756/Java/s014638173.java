import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	StringBuffer sb=new StringBuffer(sc.next());
  	int q=sc.nextInt();
  	int[] t=new int[q],f=new int[q];
  	String[] c=new String[q];
  	for(int i=0;i<q;i++){
  		f[i]=0;
  		c[i]="";
  	}
  	for(int i=0;i<q;i++){
  		t[i]=sc.nextInt();
  		if(t[i]==1){
  			sb.reverse();
  		}else{
  			f[i]=sc.nextInt();
  			c[i]=sc.next();
  			if(f[i]==1){
  				sb.reverse();
  				sb.append(c[i]);
  				sb.reverse();
  			}else{
  				sb.append(c[i]);
  			}
  		}
  	}
  	System.out.print(sb);
  }
}