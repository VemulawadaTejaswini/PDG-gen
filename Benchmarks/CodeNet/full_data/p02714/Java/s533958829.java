import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),r=0,b=0,g=0;
    String[] s=sc.next().split("");
    for(int i=0;i<n;i++){
      if(s[i].equals("R")){
        r++;
      }else if(s[i].equals("B")){
        b++;
      }else{
        g++;
      }
    }
    int f=r*g*b;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(n-1>=(2*j-i)){
          if(s[i].equals(s[j])==false&&s[j].equals(s[2*j-i])==false&&s[2*j-i].equals(s[i])==false){
            f=f-1;
          }
        }
      }
    }
    System.out.print(f);
  }
}
