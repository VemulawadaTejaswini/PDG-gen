public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list.add(a);
        }
        reverse(list);
        for (int i = 0; i < list.size(); i++) {
            Integer get = list.get(i);
            if (i == list.size()-1) {
                System.out.print(get);
            } else {
                System.out.print(get + " ");
            }
        }
        System.out.println();
    }
}
