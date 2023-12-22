import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n,m;
  	
  	n=sc.nextInt();
  	m=sc.nextInt();
  	
  	int[] s=new int[m];
  	char[] c=new char[m];
  	for(int i=0;i<m;i++){
  		s[i]=sc.nextInt();
  		c[i]=sc.next().charAt(0);
  	}
  	int f=0,g=0;
  	
  	for(int i=(int)(Math.pow(10,n-1));i<(int)(Math.pow(10,n));i++){
  		int e=0;
  		for(int j=0;j<m;j++){
  			String is=Integer.toString(i);
  			char[] ic=is.toCharArray();
  			if(ic[s[j]-1]==c[j]){
  				e++;
  			}else{
  				e=0;
  			}
  		}
  		if(e==m){
  			f++;
  			g=i;
  			break;
  		}
  	}
  	if(f==0){
  		System.out.print(-1);
  	}else{
  		System.out.print(g);
  	}
  }
}