import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String [n];
    for(int i = 0;i < n;i++){
      s[i] = sc.next();
    }

    int m = 0;
    int a = 0;
    int r = 0;
    int c = 0;
    int h = 0;
    for(int i = 0;i < n;i++){
      if(s[i].indexOf('M') == 0){
        m++;
      }
      if(s[i].indexOf('A') == 0){
        a++;
      }
      if(s[i].indexOf('R') == 0){
        r++;
      }
      if(s[i].indexOf('C') == 0){
        c++;
      }
      if(s[i].indexOf('H') == 0){
        h++;
      }
    }

    int sum = m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h + a*r*c + a*r*h + a*c*h + r*c*h;

    System.out.println(sum);
  }
}
