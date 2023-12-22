	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Scanner in = new Scanner(System.in);
		
		String s = in.next()+"$";
		int pos = 0;
		int res = 0;
		
		while(s.charAt(pos) != '$') {
			int a = 0;
			while(s.charAt(pos) == '<') {
				++pos;
				++a;
			}
			int b = 0;
			while(s.charAt(pos) == '>') {
				++pos;
				++b;
			}
			int c = Math.min(a, b);
			int d = Math.max(a, b);
			
			res += c * (long)(c - 1)/ 2;
			res += d * (long)(d + 1)/ 2;
		}
		System.out.println(res);
	
	}