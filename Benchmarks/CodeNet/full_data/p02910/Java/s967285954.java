
import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String S = sc.next();
      char c ;
      int count = 0;
      char[] data = new char[S.length()+1];

      for(int i = 0;i<S.length();i++){
        c = S.charAt(i);
        data[i+1]=c;
      }

      for(int i = 1;i<=S.length();i++){
        if(i%2==0){
          if(data[i]=='L'||data[i]=='U'||data[i]=='D'){
            count++;
          }

          }
          if(i%2!=0){
            if(data[i]=='R'||data[i]=='U'||data[i]=='D'){
            count++;
            }
        }
      }
    
      if(count==S.length()){
        System.out.println("Yes");
      }else{
        System.out.println("NO");
      }
           }
      }
