	import java.util.Scanner;		
	class Main{		
		public static void main(String[ ] args)throws java.lang.Exception {	
			Scanner reader = new Scanner(System.in);
			int height = reader.nextInt();
			int width = reader.nextInt();
			reader.close();
			int area = height*width;
			int length = 2*height + 2*width;
			System.out.println(area + " " + length);
		}	
	}		
