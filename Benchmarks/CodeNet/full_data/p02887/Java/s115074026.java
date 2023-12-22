import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String c[] = new String[n];
    int answer =1;
    for(int i=0;i<n;i++){
      c[i]=s.substring(i,i+1);
    }
    
    for(int i=0;i<n-1;i++){
      if(!c[i].equals(c[i+1])){
        answer = answer +1;
      }
    }
    System.out.println(answer);
    
  }
  

  
}