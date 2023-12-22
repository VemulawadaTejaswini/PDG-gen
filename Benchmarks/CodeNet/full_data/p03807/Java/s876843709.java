import java.util.*;

class Main{

    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	int cnt=0;
	for(int i=0;i<n;i++){
	    cnt+=(a[i]%2==1 ? 1:0);
	}

	if(cnt%2==0) System.out.println("YES");
	else System.out.println("NO");
	
	return;
    }
    

    
}
