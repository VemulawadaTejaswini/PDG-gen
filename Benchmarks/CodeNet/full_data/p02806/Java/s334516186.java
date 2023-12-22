import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    String[] s;
    s = new String[N];

    int [] t;
    t = new int[N];

    for(int i=0; i<N; i++){
       s[i] = sc.next();
       t[i] = sc.nextInt();
    }

    String X =sc.next();

    int All = 0; 

    for(int j=0; j<N; j++){
       if(s[j] == X){ 
          for(int i=(s[j].indexOf(X)+1); i<N; i++){
              All += t[i];
          }
       break;
       }
       else {
         continue;
       }
    } 
    System.out.println(All);
  }
}