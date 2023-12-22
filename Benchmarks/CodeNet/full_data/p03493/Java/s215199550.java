import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new.Scanner(System.in);
    
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();
    
    int ans;
    if(s1 == 1) {
      ans++;
    }
    if(s2 == 1) {
      ans++;
    }
    if(s3 == 1) {
      ans++;
    }
    
    System.out.println(ans);
  }
}
    