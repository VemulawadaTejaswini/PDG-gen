public class Main{
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int[] a = new int[3];
     a[0] = scan.nextInt();
     a[1] = scan.nextInt();
     a[2] = scan.nextInt();
     java.util.Arrays.sort(a);
     System.out.println(a[0]+" "+a[1]+" "+a[2]);
   }
}
