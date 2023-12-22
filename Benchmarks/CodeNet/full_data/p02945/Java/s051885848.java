import java.util.*;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int wa = 0;
        int seki = 0;
        int sa = 0;
        int unko = 0;
        
        wa = A+B;
        seki = A*B;
        sa = A-B;
       	
      /*  if(wa>seki){
        	if(wa>sa){
                System.out.println(wa);
            }else if(seki>){
            	System.out.println(seki);
            }
        }*/
        
        if(wa>seki&&wa>sa){
        	System.out.println(wa);
        }else if(seki>wa&&seki>sa){
        	System.out.println(seki);
        }else{
        	System.out.println(sa);
        }
    }

}