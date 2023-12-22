    import java.util.Scanner;
 
      class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
          String A = sc.next();
          String B = sc.next();
          String C = sc.next();
 
          A = A.charAt(A.length-1);
          String B1 = B.charAt(0);
          String B2 = B.charAt(B.length-1);
          C = C.charAt(0);
 
          if(A = B1 && B2 = C) {
              System.out.println("Yes");
          } else {
              System.out.println("No")
          }
    }
}