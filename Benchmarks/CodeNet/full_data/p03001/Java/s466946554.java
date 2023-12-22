import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int W = scan.nextInt();
			int H = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			double centerX = (double)x/2.0;
			double centerY = (double)y/2.0;
			
			double w = (double)W;
			double h = (double)H;
			double X = (double)x;
			double Y = (double)y;
			
			double State; //面積
			double Syoko; 
			double max=0;
			int count=0;
			
			if(centerX>x&&centerY>y) {//左下
				State = X*h;
				Syoko = Y*w;
				
				if(State>Syoko) {
					max = State;
					count = 0;
				}else if(State<Syoko) {
					max = Syoko;
					count = 0;
				}else if(State==Syoko) {
					max = Syoko;//Stateでもいい
					count = 1;
				}
				
				
			}else if(centerX>x&&centerY<=y) {//左上
				State = X*h;
				Syoko =(h-Y)*w;
				
				if(State>Syoko) {
					max = State;
					count = 0;
				}else if(State<Syoko) {
					max = Syoko;
					count = 0;
				}else if(State==Syoko) {
					max = Syoko;//Stateでもいい
					count = 1;
				}
				
			}else if(centerX<x&&centerY>y) {//右下
				State = (w-X)*h;
				Syoko = Y*w;
				
				if(State>Syoko) {
					max = State;
					count = 0;
				}else if(State<Syoko) {
					max = Syoko;
					count = 0;
				}else if(State==Syoko) {
					max = Syoko;//Stateでもいい
					count = 1;
				}
				
			}else if(centerX<x&&centerY<=y) {//右上
				State = (w-X)*h;
				Syoko = (h-Y)*w;
				
				if(State>Syoko) {
					max = State;
					count = 0;
				}else if(State<Syoko) {
					max = Syoko;
					count = 0;
				}else if(State==Syoko) {
					max = Syoko;//Stateでもいい
					count = 1;
				}
				
			}
			
			String str = String.format("%1$.6f", max);
			
			
			
			System.out.print(max);
			System.out.print(" ");
			System.out.print(count);
			
			
			
			
			
			
		}
		
		
	}
		

}
