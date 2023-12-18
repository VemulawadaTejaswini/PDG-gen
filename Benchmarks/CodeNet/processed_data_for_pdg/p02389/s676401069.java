public class Main {
   public static void main(String args[]){
      Scanner keyboard = new Scanner(System.in);
      int x = keyboard.nextInt();
      int y = keyboard.nextInt();
      int z, w;
      z = x * y;
      w = 2 * (x + y);
      System.out.print(z);
      System.out.print(" ");
      System.out.println(w);
   }   
}
