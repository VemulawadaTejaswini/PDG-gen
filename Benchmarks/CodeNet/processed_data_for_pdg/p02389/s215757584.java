public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		int area_size = (width*height);
		int circumference = (width*2+height*2);
		System.out.println(area_size+" "+circumference);
	}
}
