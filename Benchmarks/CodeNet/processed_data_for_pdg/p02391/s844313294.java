public class Main {
    static final int INF = 1000000000;     
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        if (a < b) System.out.println("a < b");
        else if (a > b) System.out.println("a > b");
        else System.out.println("a == b");
    }         
}
