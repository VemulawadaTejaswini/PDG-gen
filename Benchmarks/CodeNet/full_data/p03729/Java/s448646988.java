    import java.util.Scanner;
 
      class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
          String A = sc.next();
          String B = sc.next();
          String C = sc.next();
 
          String Ab = A.charAt(A.length()-1);
          String Ba = B.charAt(0);
          String Bb = B.charAt(B.length()-1);
          String Ca = C.charAt(0);
 
          if(Ab = Ba && Bb = Ca) {
              System.out.println("YES");
          } else {
              System.out.println("NO");
          }
    }
}