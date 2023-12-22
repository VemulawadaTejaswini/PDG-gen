import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      int c = Integer.parseInt(a+b);
      int count= 0 ;
      for(int i = 1;i <= 100; i++){
      	if(c%i == 0 && c/i == i){
     		count++;
        }
      }
        if(count > 0){
        	System.out.println("Yes");
        }else{
        	System.out.println("NO");
        }
     
	  
    }
}