import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		int y0 = sc.nextInt(); //starting pos
		int x0 = sc.nextInt();
		
		String s1 = sc.next();
		String s2 = sc.next();
		n = s1.length();
		
		int[] hor1 = new int[n];
		int[] hor2 = new int[n];
		int[] ver1 = new int[n];
		int[] ver2 = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			if(s1.charAt(i)=='L')
				hor1[i] = -1;
			if(s1.charAt(i)=='R')
				hor1[i] = 1;
			if(s2.charAt(i)=='L')
				hor2[i] = -1;
			if(s2.charAt(i)=='R')
				hor2[i] = 1;
			if(s1.charAt(i)=='U')
				ver1[i] = -1;
			if(s1.charAt(i)=='D')
				ver1[i] = 1;
			if(s2.charAt(i)=='U')
				ver2[i] = -1;
			if(s2.charAt(i)=='D')
				ver2[i] = 1;			
		}
		
		//horizontal first
		int satr = w+1; //can push to right from here
		int satl = 0; //can push to left from here
		for(int i = n-1; i >= 0;)
		{
			//p1
			if(hor1[i] == 1)
				satr--;
			if(hor1[i] == -1)
				satl++;
			
			if(satr - satl <= 1)
			{
				System.out.println("NO");
				return;
			}
//			System.out.println("i " + i + "a: " + satl + " " + satr);
			i--;
			if(i<0)break;
			//p2
			if(hor2[i] == 1)
			{
				satl--;
			}
			if(hor2[i] == -1)
				satr++;
			satr = Math.min(satr, w+1);
			satl = Math.max(satl, 0);

//			System.out.println("i " + i + "b: " + satl + " " + satr);
		}
		if(satr - satl <= 1 || satl >= x0 || satr <= x0)
		{
			System.out.println("NO");
			return;
		}
//		System.out.println(satl + " " + satr);
		
		satr = h+1; //can push to right from here
		satl = 0; //can push to left from here
		for(int i = n-1; i >= 0;)
		{
			//p1
			if(ver1[i] == 1)
				satr--;
			if(ver1[i] == -1)
				satl++;
			
			if(satr - satl <= 1)
			{
				System.out.println("NO");
				return;
			}
//			System.out.println("i " + i + "a: " + satl + " " + satr);
			i--;
			if(i<0)break;
			//p2
			if(ver2[i] == 1)
			{
				satl--;
			}
			if(ver2[i] == -1)
				satr++;
			satr = Math.min(satr, h+1);
			satl = Math.max(satl, 0);

//			System.out.println("i " + i + "b: " + satl + " " + satr);
		}
		if(satr - satl <= 1 || satl >= y0 || satr <= y0)
		{
			System.out.println("NO");
			return;
		}		
		
		System.out.println("YES");
	}

}
