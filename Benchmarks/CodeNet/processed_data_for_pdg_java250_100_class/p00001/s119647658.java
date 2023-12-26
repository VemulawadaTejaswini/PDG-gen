public class Main {
  public static void main (String[] args) throws java.lang.Exception {
   Scanner sc = new Scanner(System.in);
   Integer[] yama = new Integer[10];
   for(int i=0; i<10; i++) {
     yama[i] = sc.nextInt();
   }
   Arrays.sort(yama, Collections.reverseOrder());
   System.out.println(yama[0]);
   System.out.println(yama[1]);
   System.out.println(yama[2]);
 }
}
