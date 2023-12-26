class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().trim().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < K; i++) {
            sc.nextLine();
            String[] snukes = sc.nextLine().trim().split(" ");
            for (String sn : snukes)
                set.add(Integer.parseInt(sn));
        }
        System.out.println(N - set.size());
    }
}
