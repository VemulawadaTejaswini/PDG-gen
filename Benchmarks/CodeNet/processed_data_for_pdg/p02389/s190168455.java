public class Main {
    public static void main(String[] args) {
        Scanner scan_ = new Scanner(System.in);
        int h_ = scan_.nextInt();
        int w_ = scan_.nextInt();
        System.out.println( h_ * w_ + " "  + ((h_ + w_) * 2) );
    }
}
