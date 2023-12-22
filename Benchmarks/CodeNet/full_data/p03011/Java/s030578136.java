import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    
    int pq = p + q;
    int qr = q + r;
    int rp = r + p;
    
    int min = pq;
    if (pq > qr) {
      min = qr;
    } else if (qr > rp) {
      min = rp;
    }
    System.out.println(min);
  }
}