
import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int H,W,A,B = 0;

		H = scan.nextInt();
		W = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();

		//System.out.println("H: "+ H + " W: " +W+ " A: " +A+ " B: " + B);
		scan.close();

		if (H % W == 0 || W % H ==0 ){

			if(H % W == 0) {
				int x = 0;
				x = H/W;

				if (A==1 && B==x)
				{
					for(int i=0; i < H; i++)
					{
						for(int j=0; j < W; j++)
						{
							if(j%W ==i%W)
							{System.out.print(1);}
							else
							{
							 System.out.print(0);
							}
						}
						 System.out.println();
					}
				}
				else
				{
					System.out.println("No");
				}
			}

			else {
				int y = 0;
				y = W/H;

				if(A==y && B==1){
					for(int i=0; i < H; i++)
					{
						for(int j=0; j < W; j++)
						{
							if(j%H ==i%H)
							{System.out.print(1);}
							else
							{
							 System.out.print(0);
							}
						}
						 System.out.println();
					}
				}
				else
				{
					System.out.println("No");
				}
			}

		}

		else {
			System.out.println("No");
		}
	}

}