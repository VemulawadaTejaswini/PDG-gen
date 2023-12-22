import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		//call answer Method argument 4
		System.out.println(answer(A,B,C,X));

	}

	//need method
	//
	private static int answer(int A,int B,int C,int X)
	{
		int countHowToChoose = 0;
		for(int a = 0;a <= A;a++){
			for(int b = 0;b <= B;b++){
				for(int c = 0;c <= C;c++){
					int xyenQuestion = 500*a+100*b+50*c;
					//System.out.println(xyenQuestion);
					if(xyenQuestion == X){	
					countHowToChoose++;	
					}
				}
			}
		}
		return countHowToChoose;
	}
}

