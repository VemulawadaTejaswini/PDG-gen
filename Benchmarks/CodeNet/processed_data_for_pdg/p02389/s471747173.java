class Main{
    public static void main(String[] args){
        String[] x = null;
        Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		x = ip.split(" ", 0);
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		System.out.println(a*b+" "+(2*a+2*b));
    }
}
