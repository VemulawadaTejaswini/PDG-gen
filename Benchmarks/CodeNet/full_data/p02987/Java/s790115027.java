import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       
		String s=sc.next();
       
		String[] s1=s.split("");
    	
 	if(s1[0].equals(s1[1])&&s1[2].equals(s1[3])&&!(s1[0].equals(s1[2]))){
    		System.out.println("Yes");
    	}else if(s1[0].equals(s1[3])&&s1[2].equals(s1[1])&&!(s1[0].equals(s1[2]))){
     		System.out.println("Yes");
   	 }else if(s1[0].equals(s1[2])&&s1[1].equals(s1[3])&&!(s1[0].equals(s1[1]))){
    System.out.println("Yes");
    }else{
 
    	System.out.println("No");
    }
    }
}