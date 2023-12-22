import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
  		 double c=sc.nextDouble();
  		Double d=new Double(Math.sqrt(a)+Math.sqrt(b));
  		Double e=new Double(Math.sqrt(c));
  		int f=d.compareTo(e);
    
 	if(f==-1){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}