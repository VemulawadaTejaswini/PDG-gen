public class Main {
   public static void main(String args[]){
      int  a,b;
      Scanner reader = new Scanner(System.in);
      String temp[];
      temp = reader.nextLine().split(" ");
      a = Integer.parseInt(temp[0]);
      b = Integer.parseInt(temp[1]);
      System.out.printf("%d %d\n",a*b,2*(a+b));          
   }
}
