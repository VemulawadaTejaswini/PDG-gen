class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       double r = in.nextDouble();
       System.out.printf("%f %f\n", Math.PI * r * r,
		       		    2 * Math.PI * r);
    }
}
