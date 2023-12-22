import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long happy = 0;
    long cnt1 = 0;
    long cnt2 = 0;
    long rem1 = 0;
    long rem2 = 0;
    long rem3 = 0;
    
    for(int i=1; i<1000; i++) {
      rem1 = X - 500*i;
      if(rem1 > 0) {
        cnt1++;
      } else if(X%500==0) {
        cnt1 = X/500;
        return;
      } else {
        break;
      }
    }
    
    rem2 = X - 500*2;
    
    for(int i=1; i<1000; i++) {
      rem3 = rem2 - 5*i;
      if(rem3 > 0) {
        cnt2++;
      } else if(rem3%5==0) {
        cnt2 = rem3/5;
        return;
      } else {
        break;
      }
    }

    happy = 1000*cnt1 + 5*cnt2;
    System.out.println(happy);
    
  }
}