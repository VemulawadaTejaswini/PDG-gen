import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       String s=sc.next();
String[] a=s.split("");
 
 
 	if(a[0].equals("7")||a[1].equals("7")||a[2].equals("7")){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }
 
    	System.out.println();
    }
}