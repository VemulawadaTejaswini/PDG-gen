public class Main {
	public static void main(String[] args) {
		int w,h,x,y,r;
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();	
		h = sc.nextInt();	
		x = sc.nextInt();	
		y = sc.nextInt();	
		r = sc.nextInt();	
		w -= r;
		h -= r;
		if(r<=x && x<=w && r<=y && y<=h){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		sc.close();
	}
}
