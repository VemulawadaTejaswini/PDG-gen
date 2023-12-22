import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int sum = 0;
    int ichi = 0;
    int jyu = 0;
    for(int i=1;i<=n;i++){  
      //1桁目
      ichi = i%10;
      //2桁目
      jyu = (i/10)%10;
      
      if ((a <= (ichi + jyu)) && 
          ((ichi + jyu) <= b)){
        sum += i;
      }
    }
    
    System.out.println(sum);

  }
}