public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int jogen = Integer.parseInt(stdIn.nextLine());
        Set<String> gacha = new HashSet<>(jogen);
        for (int i = 0; i < jogen; i++) {
            gacha.add(stdIn.nextLine());
        }
        stdIn.close();
        System.out.println(gacha.size());
    }
}
