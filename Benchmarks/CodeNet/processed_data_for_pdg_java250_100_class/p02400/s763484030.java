class Main{
    public static void main(String[] args){
        double r,area,length;
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextDouble();
    	area = r*r*Math.PI;
    	length = 2*r*Math.PI;
    	System.out.printf("%f %f",area,length);
    	scanner.close();
    }
}
