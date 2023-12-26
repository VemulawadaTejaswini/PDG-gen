public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 13; i++) {
                String s = "";
                if (j == 1) {
                    s = "S ";
                } else if (j == 2) {
                    s = "H ";
                }
                if (j == 3) {
                    s = "C ";
                }
                if (j == 4) {
                    s = "D ";
                } else {
                }
                s = s + i;
                list.add(s);
            }
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (list.contains(s)) {
                list.remove(s);
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
