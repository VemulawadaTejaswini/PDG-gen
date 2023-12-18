public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int y = sc.nextInt();
        Long menseki = (long) (t * y);
        long nagasa = (t * 2) + (y * 2);
        System.out.println(menseki + " " + nagasa);
    }
}
