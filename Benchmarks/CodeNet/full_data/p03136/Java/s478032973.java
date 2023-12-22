import java.util.*;

public class Main{
  
  public static void main (String[] args){
    
    Main main = new Main ();
    
    main.solve();
  }
  
  private void solve(){
    
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    int[] list = new int[N];
    int sum = 0;
    boolean flag =true;
    
    for (int index=0; index<N; index++){
      int temp=scanner.nextInt();
      list[index]=temp;
      sum+=temp;
    }
    
    for (int index=0; index<N; index++){
      int temp=list[index];
      if (temp>=sum-temp){
        flag=false;
      }
    }
    
    if (flag==true){
      System.out.println("Yes");
  } else {
      System.out.println("No");
    }
  }
}