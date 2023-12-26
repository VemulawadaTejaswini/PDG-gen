class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }
        System.out.println(s.size());
    }
}
