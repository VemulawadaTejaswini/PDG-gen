import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    int l = c.length;

    int count = 0;

    for(int i=0; i<l-2;i++){
      for(int j=i+1; j<l-1;j++){
        if(c[i]==c[j]){continue;};
        for(int k=j+1; k<l;k++){
          if(c[k]==c[j]||c[k]==c[i]){continue;}
          if(j-i==k-j){continue;}
          count++;

        }
      }
    }

    System.out.println(count);


  }
}