import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int count = 0;
    int[] a = new int[n];
    int[] ans = new int[q];
    for(int i =0;i<n;i++){
      if(s.charAt(i-1)=='A'&&s.chatAt(i)=='C'){
        count++;
        a[i]=count;
      }
      else{
        a[i]=count;
      }
   
  }
}