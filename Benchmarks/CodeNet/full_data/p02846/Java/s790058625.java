import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean in = false;
		
		long t1,t2,a1,a2,b1,b2, f1, f2;
		if(!in)
		{
			t1 = sc.nextLong();
			t2 = sc.nextLong();
			a1 = sc.nextLong();
			b1 = sc.nextLong();
			a2 = sc.nextLong();
			b2 = sc.nextLong();
			f1 = (a1-a2)*t1;
			f2 = (b2-b1)*t2;
//			System.out.println(a1 + " " + a2);
		}
		else
		{
			long sf1 = sc.nextLong();
			long sf2 = sc.nextLong();
			f1 = sf1;
			f2 = sf2;
		}
		
		if(f1 < 0)
		{
			f1 *= -1;
			f2 *= -1;
		}
		
		long dis = f1;
		long bf = f2-f1;
//		System.out.println(f1 + " " + f2 + " " + bf);
		
		if(f1 == f2)
		{
			System.out.println("infinity");
			return;
		}
		
		long score = 0;
		if(dis > bf && bf > 0)
		{
			score += (dis/bf)*2;
			dis = dis%bf;
		}
		if(dis > 0 && bf > 0)
			score++;
		
		System.out.println(score);

	}

}
