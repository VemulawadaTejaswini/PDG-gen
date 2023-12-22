import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    int count = 0;
    int min = 100000000;
    for(int i = 1;i<n;i++){
      if(c[i]=='E')count++;
    }
    min = Math.min(min,count);
    for(int i = 1;i<n;i++){
      if(c[i-1]=='W')count++;
      if(c[i]=='E')count--;
      min = Math.min(min,count);
    }
    System.out.println(min);
  }
}
