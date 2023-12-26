public class Main {
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
		int jisin_nagasa = sc.nextInt();
		int hunsin_nagasa = sc.nextInt();
		int jikan = sc.nextInt();
		int hun = sc.nextInt();
		double jisin_kakudo = (jikan * 60 + hun) * 0.5;
		double hunsin_kakudo = hun * 6;
		double kakudo_sa = 0;
		if (jisin_kakudo > hunsin_kakudo) {
			kakudo_sa = jisin_kakudo - hunsin_kakudo;
		} else {
			kakudo_sa = hunsin_kakudo - jisin_kakudo;
		}
		double b = jisin_nagasa;	
		double c = hunsin_nagasa;	
		double e = kakudo_sa;			
		double r = Math.sqrt(Math.pow(b,2)+Math.pow(c,2) - 2 * b * c * Math.cos(Math.toRadians(e)));
		System.out.println(r);
	}
}
