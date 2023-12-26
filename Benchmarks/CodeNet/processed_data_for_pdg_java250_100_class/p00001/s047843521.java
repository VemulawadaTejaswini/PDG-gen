class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer[] mountains = new Integer[10];
        for (int i = 0; i < 10; i++) {
            mountains[i] = sc.nextInt();
        }
        Arrays.sort(mountains, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 3; i++) {
            sb.append(mountains[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
