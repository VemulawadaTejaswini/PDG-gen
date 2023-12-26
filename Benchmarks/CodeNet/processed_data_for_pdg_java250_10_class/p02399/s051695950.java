class Main{
    public static void main(String[] args){
        int a,b,d,r;
        double f;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
    	b = scanner.nextInt();
    	d = a/b;
    	r = a%b;
    	f = (double)a/b;
    	System.out.printf("%d %d %5f",d,r,f);
    	scanner.close();
    }
}
