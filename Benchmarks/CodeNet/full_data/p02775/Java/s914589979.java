import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       String N = sc.next();
       char[] c = N.toCharArray();
       long a =0;
       boolean[] flg=new boolean[c.length];
       int cnt=0;
       for (int i=c.length-1 ; i>=0; i--) {
    	   int tmp=Character.getNumericValue(c[i]);
 			if(tmp==4) {
  				if(i!=0&&Character.getNumericValue(c[i-1])>=5&&!flg[i-1]) {
  					if(i!=c.length-1&&Character.getNumericValue(c[i+1])>=5&&!flg[i+1]) {
  						a--;
  						
  					}
  				}
  			}
  			if(tmp>=5) {
   				if(tmp==5) {
   					if(i==0||Character.getNumericValue(c[i-1])<5) {
   						if(i==c.length-1||Character.getNumericValue(c[i+1])<5) {
   							a--;
   							flg[i]=true;
   						}
   					}
   				}
   				if(i!=0&&Character.getNumericValue(c[i-1])>=5) {
   					a--;
   				}
   				if(i!=c.length-1&&Character.getNumericValue(c[i+1])>=5) {
   					a--;
   				}
   				tmp=11-tmp;
	   		}

    	   
           a=a+tmp;    		   
       }
       

       System.out.println(a);
   }

}