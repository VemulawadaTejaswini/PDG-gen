import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    
    int[] array = {n1,n2,n3};
    int matchCount = 0;
    
    Arrays
      .stream(array)
      .collect(Collectors.groupingBy(s -> s))
      .forEach((k,v) -> 
               if(k == 5){
                 if(v.size() == 2){
                   matchCount += 1;
                 }
               }else if(k == 7){
                 if(v.size() == 1){
                   matchCount += 1;
                 }
               }
               );
      
    if(matchCount == 2){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}