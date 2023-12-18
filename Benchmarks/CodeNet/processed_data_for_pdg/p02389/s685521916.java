class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	int a = Integer.parseInt(s);
	s = scan.next();
	int b = Integer.parseInt(s);
	System.out.println(a*b + " " + (a+b)*2);
    }
}
