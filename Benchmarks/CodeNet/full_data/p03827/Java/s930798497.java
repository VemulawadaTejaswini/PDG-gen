import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=0;
    
    sc.next();
    String s=sc.next();
    
    for(int i=0;i<s.length();i++){
      if(a<=b)a=b;
      if(s.charAt(i)=='I')b++;else b--;
    }
    System.out.println(a);
  }
}