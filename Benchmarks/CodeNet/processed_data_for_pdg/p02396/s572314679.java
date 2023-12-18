public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int input;
        for(int i = 1; (input = scan.nextInt()) != 0; ++i){
            System.out.println("Case " + i + ": " + input);
        }
    }
}
