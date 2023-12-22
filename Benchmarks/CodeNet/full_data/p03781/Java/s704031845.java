	public static void main(String[] args) {
		int x = 0;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		int t = 0;
		t = s.nextInt();
		int now = 0;
		int ans = 0;
		for(int i = t; i > 0; i--) {
			if(now + t == x) {
				ans++;
				break;
			} else if(now + t < x) {
				now += t;
				ans++;
			}
		}
		System.out.println(ans);
	}