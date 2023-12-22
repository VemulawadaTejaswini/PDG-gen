import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 
    long list[] = new long[n];
    for (int i = 0; i<n; i++ ) {
      list[i]= sc.nextLong();
    }
    
    long sum = 0;
    for (int i = 0; i<n; i++) {
      
      for (int j = 0; j<n; j++) {
        long a = list[i];
        long b = list[j];
        int count = 0;
        while(a!=0 || b!=0) {
          if (a%2!=b%2) {
            sum += Math.pow(2, count);
          }
//          if (sum>=(int)Math.pow(10, 9)+7) {
//            sum = sum % (int)Math.pow(10, 9)+7;
//          }
//          System.out.println(a+ " " + b + " " + i +  " " +j + " " + sum);
          count++;
          if (a!=0) {
            a /= 2;
          }
          if (b!=0) {
            b /= 2;
          }
          
        }
      
      }
    }
    
    System.out.println((sum/2)% ((long)Math.pow(10, 9)+7));
  }
}