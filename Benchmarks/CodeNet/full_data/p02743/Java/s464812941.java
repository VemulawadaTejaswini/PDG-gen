import java.util.*;

class Main{

 public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
  if(Math.sqrt(sc.nextDouble()) + Math.sqrt(sc.nextDouble()) < Math.sqrt(sc.nextDouble())){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }  
 }
}