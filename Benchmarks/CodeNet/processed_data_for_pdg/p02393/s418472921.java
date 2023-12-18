public class Main{
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int[] x = new int[3];
     x[0] = scan.nextInt();
     x[1] = scan.nextInt();
     x[2] = scan.nextInt();
     java.util.Arrays.sort(x);
     System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}
