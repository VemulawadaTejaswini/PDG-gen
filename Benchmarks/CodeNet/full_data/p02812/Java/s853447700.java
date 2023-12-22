import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    int count=0;
    for(int i=0;i<n-3;i++) {
        if(s.charAt(i)=='A' && s.charAt(i+1)== 'B' && s.charAt(i+2)=='C') {
            count++;
        }
    }
    System.out.println(count);
}
}
