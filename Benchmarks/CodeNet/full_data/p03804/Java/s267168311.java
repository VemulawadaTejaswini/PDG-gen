import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  int n=no.nextInt();
  int m=no.nextInt();
  String s[]=new String[n];
  String s1[]=new String[m];
  for(int i=0;i<n;i++){
    s[i]=no.next();
  }
  for(int i=0;i<m;i++){
    s1[i]=no.next();
  }
 /* 3 2
#.#
.#.
#.#
#.
.#*/
  if(m>n){
    System.out.println("NO");
  }
  else{
   boolean t=true;
    int o=0;
    for(int i=0;i<n;i++){
     int g=i;
      for(int j=0;j<m;j++){
        if(g<n&&s[g].contains(s1[j])){
          o++;
          g++;
        }
        else{
          o=0;
        }
      }
      if(o==m){
        System.out.println("YES");
        t=false;
        break;
      }
    }
    if(t){
      System.out.println("NO");
    }
  }
 }

}
