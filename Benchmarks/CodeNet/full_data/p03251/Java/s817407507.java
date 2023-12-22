import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int X = sc.nextInt();
	int Y = sc.nextInt();
	int maxX = -100;
	int minY = 100;
	int x=0;
	int y=0;
	for(int i=0;i<N;i++){
	    x = sc.nextInt();
	    if(x>maxX) maxX=x;
	}
	for(int i=0;i<M;i++){
	    y = sc.nextInt();
	    if(y<minY) minY=y;
	}
	boolean result = false;
	for(int z=X+1;z<=Y;z++){
	    if(maxX<z && minY>=z) result=true;
	}
	if(result) System.out.print("No War");
	else System.out.print("War");
    }
}
