import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int c=sc.nextInt();
    
 	if(a==5&&b==5&&c==7||a==5&&b==7&&c==5||a==7&&b==5&&c==5){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}
