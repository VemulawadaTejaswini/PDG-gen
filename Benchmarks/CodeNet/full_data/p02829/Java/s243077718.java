import java.util.*;
 
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    //Aが1の場合
    if(A == 1){
      if(B == 2){
      	System.out.println(3);
      }else{
        System.out.println(2);
      }
    }else if(A == 2){
      //Aが２の場合
      if(B == 1){
      	System.out.println(3);
      }else{
        System.out.println(1);
      }
    }else{
      //それ以外(Aが３の場合)
      if(B == 1){
      	System.out.println(2);
      }else{
        System.out.println(1);
      }
    }
      

  }
      
 }