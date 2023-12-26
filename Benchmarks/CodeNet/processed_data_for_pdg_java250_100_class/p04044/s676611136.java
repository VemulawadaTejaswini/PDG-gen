class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
        	strs[i] = sc.next();
		}
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i]);
		}
        System.out.println(sb.toString());
    }
}
