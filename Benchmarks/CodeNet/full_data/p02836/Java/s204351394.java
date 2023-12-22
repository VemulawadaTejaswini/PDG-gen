import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      int count = 0;
        for (int i = 0; i < a.length()/2; i++) {
          	if(a.charAt(i) != a.charAt(a.length()-i-1)){
                System.out.println(a.charAt(i));
              System.out.println(a.charAt(a.length()-i-1));
				count += 1;
            }
        }
      System.out.print(count);
    }
  
}