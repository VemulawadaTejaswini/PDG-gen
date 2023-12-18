public class Main{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int i = 0;
   while(n != 0){
     System.out.println("Case " + (++i) + ": " + n);
     n = sc.nextInt();
   }
 }
}
