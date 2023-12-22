import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    r = Math.min(r,l+2019);
    long ans = (long)Math.pow(10,9)+7;
    for(int i = l; i < r; i++){
        for(int j = i+1; j <= r; j++){
            ans = (long)Math.min(ans,(i*j)%2019);
        }
    }
    System.out.println(ans);
  }
}