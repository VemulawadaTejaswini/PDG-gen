import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> B = new ArrayList<>();
   
    for(int i = 0; i < n; i++){
      B.add(sc.nextInt());
      Collections.reverse(B);
    }
    
    for(int i = 0; i < n; i++){
       System.out.print(B.get(i) + " ");
     }
    
     System.out.println();
  }  
}