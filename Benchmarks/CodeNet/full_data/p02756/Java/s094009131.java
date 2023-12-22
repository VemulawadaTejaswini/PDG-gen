import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    String S = next();
    int Q = nextInt();

    int lng = S.length() + Q;

    StringBuilder sb = new StringBuilder(lng);

    int T,F;
    String C;

    sb.append("-");

    boolean mode = true;

    for(int i=0;i<Q;i++){
      T = nextInt();
      if(T==1){
        mode = !mode;
      }
      else{
        F = nextInt();
        C = next();
        if(F==1){
          if(mode){
            sb.insert(0,C);
          }
          else{
            sb.append(C);
          }
        }
        else{
          if(mode){
            sb.append(C);
          }
          else{
            sb.insert(0,C);
          }
        }
      }
    }

    if(!mode){
      sb.reverse();
    }

    String ans = sb.toString();

    if(!mode){
      StringBuilder aaa = new StringBuilder(S.length());
      aaa.append(S);
      aaa.reverse();
      S = aaa.toString();
    }

    ans = ans.replace("-",S);


    System.out.println(ans);



  }





  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

}
