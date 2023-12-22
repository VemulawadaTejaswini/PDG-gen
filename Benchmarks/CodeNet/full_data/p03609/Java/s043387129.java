import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int Money = scan.nextInt();
      int A     = scan.nextInt();
      int B     = scan.nextInt();

      Money -= A;
      System.out.println(Money % B);
   }
}

