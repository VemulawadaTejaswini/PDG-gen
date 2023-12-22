import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    List<String> a = new ArrayList<String>();
    
    for(int i=0;i<n;i++){
      if(n % 2 == 0){
        if(i % 2 == 0){
         a.add(0,sc.next()); 
        }else{
          a.add(sc.next()); 
        }
      }else{
        if(i % 2 != 0){
          a.add(0,sc.next()); 
        }else{
          a.add(sc.next()); 
        }
      }

    }
    System.out.println(String.join("",a));
  }
}