import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Main main = new Main();
    main.solve();
  }
  
  private void solve(){
    
    Scanner scanner = new Scanner(System.in);
    
    String S = scanner.nextLine();
    int N = S.length();
    int count=0;
    boolean flag=true;
    StringBuffer sb = new StringBuffer(S);
    
    while (flag){
      flag=false;
      for (int index=0; index+1<sb.length(); index++){
        if ((sb.charAt(index)=='0'&&sb.charAt(index+1)=='1')||
            (sb.charAt(index)=='1'&&sb.charAt(index+1)=='0')){
          if (sb.length()!=0){
          sb.delete(index,index+2);
          }
        flag=true;
        count++;
        break;
        }
      }
      if(sb.length()==0){
        flag=false;
      }
    }
    System.out.println(count*2);
  }
}