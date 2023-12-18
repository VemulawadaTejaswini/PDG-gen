public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= 1 && b <= 100) {
            int lapLength = a * 2 + b * 2;
            int squareMeasure = a*b;
            System.out.println(squareMeasure + " " + lapLength);
        }
    } 
}
