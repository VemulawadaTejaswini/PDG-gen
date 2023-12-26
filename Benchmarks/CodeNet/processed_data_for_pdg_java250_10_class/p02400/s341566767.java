class Main {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    double r = Double.parseDouble(s1);
	    double s = Math.PI * r * r;
	    double l = Math.PI * (r + r);
	    System.out.println(String.format("%1$3f",s) + " " + String.format("%1$3f",l));
	}
}
