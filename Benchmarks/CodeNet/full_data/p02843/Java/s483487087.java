import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int x=sc.nextInt();
      	int o=0;
      	int n=x/100;
      	if(x-n*100<=5*n){
        	o=1;
        }
      	System.out.println(o);
    }
}