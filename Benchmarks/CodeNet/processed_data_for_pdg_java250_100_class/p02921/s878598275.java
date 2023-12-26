class Main {
	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		String n = ipt.next();
		String[] alpha = null;
		String[] alpha2 = null;
		int ans = 0;
		alpha = n.split("");
		n = ipt.next();
		alpha2 = n.split("");
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i].equals(alpha2[i])) {
				ans++;
			}
		}
		System.out.println(ans);
		ipt.close();
	}
}
