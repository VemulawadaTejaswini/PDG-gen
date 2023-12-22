import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
          
    if(1<n&&n<4){
      System.out.println(2);
    }else if(4<=n&&n<8){
      System.out.println(4);
    }else if(8<=n&&n<16){
      System.out.println(8);
    }else if(16<=n&&n<32){
      System.out.println(16);
    }else if(32<=n&&n<64){
      System.out.println(32);
    }else if(n==1){
      System.out.println(1);
    }else{
      System.out.println(64);
    }
  }
}