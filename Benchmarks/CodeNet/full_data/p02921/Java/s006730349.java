import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextInt();
    String t=sc.nextInt();
    final char[] S=s.toCharArray();
    final char[] T=t.toCharArray();
    int counter=0;
    for(int i=0;i<3;i++){
      if(S[i]==T[i]){
        counter++;
      }
    }
    System.out.println(counter);
  }
}