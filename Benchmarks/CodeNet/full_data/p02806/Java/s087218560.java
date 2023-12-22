import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] names = new String[n];
    int[] seconds = new int[n];
    StringTokenizer st;
    
    for(int i = 0; i < n; i++){
      st = new StringTokenizer(sc.nextLine());
      
      names[i] = st.nextToken();
      seconds[i] = Integer.parseInt(st.nextToken());
    }
    
    String slept = sc.nextLine();
    boolean awake = true;
    int ans = 0;
    
    for(int i = 0; i < n; i++){
      if(awake){
        if(slept.equals(names[i])){
          awake = false;
        }
      }else{
        ans += seconds[i];
      }
    }
    
    System.out.println(ans);
  }
}