import java.util.Scanner;

class A {
	
	public static void main(String[] args)
	{
		new A().run();		
	}
	
	public void run()
	{
		//max stickers
		//then max sticker-toys
		//then max toys
		
		Scanner file = new Scanner(System.in);
		int untasty = file.nextInt();
		int tasty = file.nextInt();
		int poison = file.nextInt();
		int ans = Math.min(poison, untasty);
		poison -= Math.min(poison, untasty);
		if(poison <= tasty) {
			ans += poison + tasty;
		}else {
			ans += tasty*2+1;
		}
		System.out.println(ans);
	}
	
}