import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
  	int q=sc.nextInt(),e=0,d=0;
  	int[] t=new int[q],f=new int[q];
  	String[] c=new String[q];
  	
  	for(int i=0;i<q;i++){
  		f[i]=0;
  		c[i]="";
  		t[i]=sc.nextInt();
  		if(t[i]==1){
  			e++;
  			d++;
  		}else{
  			f[i]=sc.nextInt();
  			c[i]=sc.next();
  			if(f[i]==1){
  				if(e%2==0){
  					s=c[i]+s;
  					e=0;
  				}else{
  					s=s+c[i];
  					e=0;
  				}
  			}else{
  				if(e%2==0){
  					s=s+c[i];
  					e=0;
  				}else{
  					s=c[i]+s;
  					e=0;
  				}
  			}
  		}
  	}
  	StringBuffer sb=new StringBuffer(s);
  	if(d%2==0){
  	}else{
  		sb.reverse();
  	}
  	System.out.print(sb);
  }
}