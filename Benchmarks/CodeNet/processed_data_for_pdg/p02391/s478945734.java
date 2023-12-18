public class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        int a_ = scan_.nextInt();
        int b_ = scan_.nextInt();
        System.out.println( a_ == b_ ? "a == b" : a_ > b_ ? "a > b" : "a < b");
    }
}
