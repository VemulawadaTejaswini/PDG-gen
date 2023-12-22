import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();

    int count = 0;

    for(int i=0; i<c.length-2;i++){
      for(int j=i+1; j<c.length-1;j++){
        for(int k=j+1; k<c.length;k++){
         if(j-i==k-j){continue;}

         if(c[i]!=c[j]&&c[j]!=c[k]&&c[k]!=c[i]){count++;}
        }
      }
    }

    System.out.println(count);


  }
}