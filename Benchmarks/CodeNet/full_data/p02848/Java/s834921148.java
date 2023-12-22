import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char[] c=sc.next().toCharArray();
    for(int i=0;i<c.length;i++){
      c[i]=(char)(((int)c[i]+n)%26);
    }
    System.out.println(String.valueOf(c));
  }
}