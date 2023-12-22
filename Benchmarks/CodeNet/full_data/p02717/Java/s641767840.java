import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
	    int m=s.nextInt();
	    int total=0,count=0;
	    int a[] = new int[n];
	  for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
	        total+=a[i];
	    }
	    total/=(4*m);
	    for(int i=0; i<n; i++){
	        if(a[i]>=total){
	            count++;
	        }
	        else{
	            count=count;
	        }
	    }
	    if(count>=m){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	    
	}
}
