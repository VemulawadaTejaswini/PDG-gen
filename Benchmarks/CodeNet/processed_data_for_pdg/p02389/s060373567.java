public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a = n;
            n = in.nextInt();
            int b = n;
            in.close();
            System.out.println((a*b) + (" ") + (2*a + 2*b));
    }
 }
