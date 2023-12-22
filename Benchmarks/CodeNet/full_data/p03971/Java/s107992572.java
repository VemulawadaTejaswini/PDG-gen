
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    String ans[] = new String[N];
    int passC =0;
    int passB =0;
    String tmp="";
    for(int i=0;i<N;i++){
      tmp=S.substring(i,i+1);
      if(tmp.equals("a")){
        if(passC<A+B){
          ans[i]="Yes";
          passC++;
        }else{
          ans[i]="No";
        }
      }else if(tmp.equals("b")){
        if(passC<A+B&&passB<B){
          ans[i]="Yes";
          passC++;
          passB++;
        }else{
          ans[i]="No";
        }
      }else{
        ans[i]="No";
      }
    }
    for(int i=0;i<N;i++){
      System.out.println(ans[i]);
    }
  }
  

  
}
