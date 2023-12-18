class Main{
    public static void main(String[] args){
        int a,b,length,area;
    	Scanner scanner = new Scanner(System.in);
    	a = scanner.nextInt();
    	b = scanner.nextInt();
    	length = 2*(a+b);
    	area   = a*b;
        System.out.println(area + " " + length);
    }
}
