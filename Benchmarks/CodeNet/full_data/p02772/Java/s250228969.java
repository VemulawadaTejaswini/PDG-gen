import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag =  false;
    int num;
    int count = 0;

    for(int i=0; i<n; i++){
      num = sc.nextInt();
      if(num%2==0){
        flag = true;
        if(num%3!=0&&num%5!=0){flag = false;}
      }
    }

     if(flag){
       System.out.println("APPROVED");
     }else{
       System.out.println("DENIED");
     }



  }
}