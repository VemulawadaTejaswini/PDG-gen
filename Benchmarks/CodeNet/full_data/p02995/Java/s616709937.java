import java.util.*;

public class Main{
  punlic static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    
    for(int i=a;i<=b;i++){
      if(i%c!=0 && i%d!=0){
        count++;
      }
    }
    System.out.println(count);
  }
}