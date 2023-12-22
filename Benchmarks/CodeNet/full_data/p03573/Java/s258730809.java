import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      
      if(a==b){
        System.out.print(c);
      }
      if(c==b){
        System.out.print(a);
      }
      if(a==c){
        System.out.print(b);
      }
      
		
      
    }
}