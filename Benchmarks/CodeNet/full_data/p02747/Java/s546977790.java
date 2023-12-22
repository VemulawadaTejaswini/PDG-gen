import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        String s=sc.next();
  		String[] a=s.split("");
  		int ans=0;
  		int c=0;
  
		while(c<a.length){
        	if(a[c].equals("h")){
            	c=c+2;
            }else{
            	ans++;
              	c=c+2;
            }
          
        }
  		c=1;
  
  		while(c<a.length){
        	if(a[c].equals("i")){
            	c=c+2;
            }else{
            	ans++;
              	c=c+2;
            }
          
        }
    
    
 	if(ans==0){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}
