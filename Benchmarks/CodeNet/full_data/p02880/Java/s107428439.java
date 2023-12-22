import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int num = 0; 

    for(int i=1; i<10; i++){
       for(int j=1; j<10; j++){
          if(N == i*j){
            num++;
          }
       }
    }
    
    if(num != 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }    
  }
}


      