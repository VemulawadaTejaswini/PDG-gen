 public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    calculation(a, b);
}

public static void calculation(int a, int b) {
    int sub = a > b ? a - b : b - a;
    if (sub % 2 == 1) {
        System.out.println("IMPOSSIBLE");
        return;
    }
    int k = sub / 2 + (a > b ? b : a);
    System.out.println(String.format("%d", k));
}