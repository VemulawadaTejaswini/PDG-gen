    import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    int a = 0;
    int b = 0;
    int n = 1;
    Scanner scan = new Scanner(System.in);
    
    a=scan.nextInt();
    b=scan.nextInt();
    
    if(a<=0 && b>=0){
    	System.out.println("Zero");
    }else if(a>0){
    	System.out.println("Positive");
    }else{
    	for(int i=a;i<=b;i++){
    		n=n*(-1);
    	}
    	if(n<0){
    		System.out.println("Negative");
    	}else{
    		System.out.println("Positive");
    	}
    }

    }
}