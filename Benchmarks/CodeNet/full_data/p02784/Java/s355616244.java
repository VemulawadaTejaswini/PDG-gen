
    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    	int[] a=new int[100000];
    		Scanner sc = new Scanner(System.in);
    		
    		  int b = sc.nextInt();
    		  int c = sc.nextInt();
    		  
    	   for(int i=0;i<c;i++){
    	   
    	      a[i]=sc.nextInt();
    	      b-=a[i];
    	   }
    
    	         if(b>0){
    	         
    	         System.out.println("No");
    	         } else{
    	         System.out.println("Yes");
    	         }
    	       
    	}
    }