class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double A = sc.nextDouble(); 
	    double B = sc.nextDouble(); 
	    double H = sc.nextDouble(); 
	    double M = sc.nextDouble(); 
	    double cosC = 0;
	    double h = (H * 30) + (M * 0.5);
	    double s = M * 6;
	    if (h > s) { cosC = h - s; } else if (h < s) { cosC = s - h; }
	    double C = Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(Math.toRadians(cosC)));
	    System.out.println(C);
	  }
}
