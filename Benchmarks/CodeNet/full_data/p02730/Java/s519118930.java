import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
     	String s=sc.next();
		String[] a=s.split("");
  		int ans=0;
  		int n=s.length();

		for(int c=0;c<n/2;c++){
    		if(!a[c].equals(a[n-c-1])){
              ans=1;
            }
    	}
  		for(int c=0;c<n/2/2;c++){
    		if(!a[c].equals(a[n/2-1-c])){
              ans=1;
            }
    	}
    for(int c=n/2+1;c<n;c++){
    		if(!a[c].equals(a[n-c-1])){
              ans=1;
            }
    	}
  
 	if(ans==0){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }
 

    	
    }
}
