    import java.util.Scanner;
 
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
　　double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();
      
       double i = 0;
 
       while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
           a = b/2 + c/2;
           b = c/2 + a/2;
           c = a/2 + b/2;
           i++;
       }
      Sysytem.out.println(i);
  }
}