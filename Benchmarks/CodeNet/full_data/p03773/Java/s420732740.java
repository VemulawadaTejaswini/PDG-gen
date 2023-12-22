import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int start = a+b;
        
      if(start>23){
        start = start-24;
      }
       
       System.out.print(start);
      
    }
}