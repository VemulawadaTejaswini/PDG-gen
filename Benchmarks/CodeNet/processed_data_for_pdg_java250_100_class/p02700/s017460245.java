public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        double a = (C + (B - 1))/B;
        double b = (A + (D - 1))/D;
        if (a <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
