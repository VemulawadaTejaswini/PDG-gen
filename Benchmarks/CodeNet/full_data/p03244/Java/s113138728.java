import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int[] num1 = new int[100000];
    int[] num2 = new int[100000];
    for(int i = 0; i < N; i++){
      if(i%2 == 0){
        num1[Integer.parseInt(S[i])-1]++;
      }else{
        num2[Integer.parseInt(S[i])-1]++;
      }
    }
    
    int n, n1, n2, m, m1, m2;
    n = n1 = n2 = m = m1 = m2 = 0;
    for(int i = 0; i < 100000; i++){
      if(num1[i] > n1){
        n2 = n1;
        n1 = num1[i];
        n = i;
      }else if(num1[i] > n2){
        n2 = num1[i];
      }
      
      if(num2[i] > m1){
        m2 = m1;
        m1 = num2[i];
        m = i;
      }else if(num2[i] > m2){
        m2 = num2[i];
      }
    }
    
    int ans = 0;
    if(n != m){
      ans += (N/2) - n1;
      ans += (N/2) - m1;
    }else{
      int a = (N/2)-n1 + (N/2)-m2;
      int b = (N/2)-m1 + (N/2)-n2;
      ans += Math.min(a, b);
    }
    System.out.println(ans);
  }
}