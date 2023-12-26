class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().trim().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < K; i++) {
            br.readLine();
            String[] snukes = br.readLine().trim().split(" ");
            for (String sn : snukes)
                set.add(Integer.parseInt(sn));
        }
        System.out.println(N - set.size());
    }
}
