public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int area = num1 * num2;
        int around = 2 * (num1 + num2);
        System.out.println(area + " " + around);   
        scanner.close();
    }
}
