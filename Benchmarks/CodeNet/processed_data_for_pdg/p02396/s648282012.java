public class Main {
    static final int INF = 1000000000;     
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int t = 0;        
        while (input.hasNextInt()) {
            int x = input.nextInt();
            if (x == 0) break;
            else System.out.println("Case " + ++t + ": " + x);
        }
    }         
}
