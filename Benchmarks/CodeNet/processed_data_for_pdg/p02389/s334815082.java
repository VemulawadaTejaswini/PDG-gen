class Main{
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int area = 0;
			int perimeter = 0;
			area = a * b;
			perimeter = a * 2 + b * 2;
			System.out.println(area + " " + perimeter);
	}
}
