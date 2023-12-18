public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int menseki = num1 * num2;
        int shu = num1*2 + num2*2;
        System.out.println(menseki + " " + shu);
    }
}
