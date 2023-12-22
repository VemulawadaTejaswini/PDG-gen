import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    int count=0;
    int max=0;
    for(int i=0;i<n;i++){
      if(str.charAt(i)=='D'){
        count--;
      }else{
        count++;
      }
      if(count>max){
        max = count;
      }
    }
    System.out.println(max);
	}
}
