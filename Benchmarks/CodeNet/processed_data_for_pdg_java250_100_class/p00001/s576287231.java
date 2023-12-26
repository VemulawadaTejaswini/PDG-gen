class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] mountains = new int[10];
        for(int i = 0; i < 10; i++) {
            int tmp = Integer.parseInt(r.readLine());
            mountains[i] = tmp;
        }
        Arrays.sort(mountains);
        for(int i = 9; i > 6; i--) {
            System.out.println(mountains[i]);
        }
    }
}
