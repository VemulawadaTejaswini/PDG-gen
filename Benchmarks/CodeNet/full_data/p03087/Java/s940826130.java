import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int c1 = 0,c2 = 0;
    String s = sc.next();
    int count=0;
    int box[]=new int[n1];
    boolean ac = false;
    for(int i = 0;i < n1-1;i++){
        if(s.charAt(i)=='A'&&s.charAt(i+1)=='C')box[i+1]=1;
    }
    for(int l = 0;l < n2;l++){
      c1 = sc.nextInt();
      c2 = sc.nextInt();
      for(int i = c1;i < c2;i++){
		if(box[i]==1)count++;
      }
      System.out.println(count);
      count = 0;
    }
  }
}