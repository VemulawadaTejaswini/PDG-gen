import java.util.*

public class Main{
	public static void main(String[] args){
    	Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int x=a+b;
        int y=a*b;
        int z=a-b;
        if(x>y&&x>z){
        	System.out.println(x);
        }else if(y>x&&y>z){
            Sytem.out.println(y);
        }else{
        	        	System.out.println(z);
        }
        }}