public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int A = in.nextInt();
        int count = 0;
        while(H>0)
        {
            H=H-A;
            count++;
        }
        System.out.println(count);
    }
 }
