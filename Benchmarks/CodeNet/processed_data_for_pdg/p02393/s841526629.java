public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String input[];
      String answer;
      int a;
      int b;
      int c;
      int temp;
      input = sc.nextLine().split(" ",0);
      a = Integer.parseInt(input[0]);
      b = Integer.parseInt(input[1]);
      c = Integer.parseInt(input[2]);
      if(a > b){
         temp = a;
         a = b;
         b = temp;
      }
      if(b > c){
         temp = b;
         b = c;
         c = temp;
      }
      if(a > b){
         temp = a;
         a = b;
         b = temp;
      }
     System.out.println(a + " " + b + " " + c);
   }
}
