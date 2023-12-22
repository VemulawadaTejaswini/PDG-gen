import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		int[] a1=new int[n+1];
  		int[] a2=new int[n+1];
        a1[0]=0;
  		a2[0]=0;
		for(int c=1;c<n+1;c++){
    		a1[c]=a1[c-1]+sc.nextInt();
    	}
  		for(int c=1;c<n+1;c++){
    		a2[c]=a2[c-1]+sc.nextInt();
    	}
  		int max=0;
    
 	for(int d=1;d<n+1;d++){
       max=Math.max(max,a1[d]-a1[0]+a2[n]-a2[d-1]);
    }

    	System.out.println(max);
    }
}
