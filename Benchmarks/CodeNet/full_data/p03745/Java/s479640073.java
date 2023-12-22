import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=1;
    int[] a=new int[n];
    boolean p=false,m=false;
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    if(n==1)System.out.println(count);
    else{
    	if(a[0]<a[1])p=true;
    	else if(a[0]>a[1])m=true;
    	for(int i=1;i<n-1;i++) {
    		if(p) {
    			if(a[i]>a[i+1]) {
    				count++;
    				m=false;
    			}
    		}else if(m){
    			if(a[i]<a[i+1]) {
    				count++;
    				m=false;
    			}
    		}else {
    			if(a[i]<a[i+1])p=true;
    	    	else if(a[i]>a[i+1])m=true;
    		}
    	}
    	System.out.println(count);
    }
  }
}
