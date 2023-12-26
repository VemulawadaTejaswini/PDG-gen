public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String AB = String.valueOf(a) + String.valueOf(b);
        double ab = Double.parseDouble(AB);
        int square =(int) Math.sqrt(ab);
        int conf = square * square;
        String judge = (int)ab == conf ? "Yes" : "No";
        System.out.println(judge);
    }
}
