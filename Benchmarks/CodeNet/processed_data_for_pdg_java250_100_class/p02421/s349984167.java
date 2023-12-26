class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int t = 0, h = 0;
		for (int i = 0; i < x; i++) {
			String str = br.readLine();
			String[] fight = str.split(" ");
			if (fight[0].equals(fight[1])) {
				t++;
				h++;
			} else {
				boolean bl=false;
				for (int l = 0;(l<fight[0].length())&&(l<fight[1].length()); l++) {
					if (fight[0].charAt(l) == fight[1].charAt(l))
						continue;
					else if (fight[0].charAt(l) > fight[1].charAt(l)) {
						t += 3;bl=true;
						break;
					} else if(fight[0].charAt(l) < fight[1].charAt(l)){
						h += 3;bl=true;
						break;
					}
				}if(bl==false){
					if(fight[0].length()>fight[1].length())t+=3;
					else h+=3;
				}
			}
		}
		System.out.printf("%d %d%n", t, h);
	}
}
