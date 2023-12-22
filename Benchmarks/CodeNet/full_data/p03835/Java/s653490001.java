import java.util.*;


class Main{
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int k = sc.nextInt();
    int s = sc.nextInt();
    int count = 0;
    
    for(int i=1;i<=k;i++){
      for(int j=1;j<=k;j++){
        if(i+j+s-(i+j) == s){
          count++;
        }
      }
    }
    
    System.out.println(count);
    
  }
}