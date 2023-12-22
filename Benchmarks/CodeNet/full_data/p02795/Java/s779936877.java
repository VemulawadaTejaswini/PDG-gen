import java.util.Scanner;
public class Main{
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int x, y ,n;
		x = sc.nextInt();
		y = sc.nextInt();
		n = sc.nextInt();
		System.out.println(plainting(x,y,n));
    
  }
  
  public static int plainting(int x,int y ,int n) {
		
		//aは大きい辺，bは小さい辺
		int a = 0;
		int b =0;
		
		if(x>=y) {
			a = x; 
			b = y;
		}else {
			a= y;
			b= x;
		}
		int k = 1;
		while(n >a*k) {
			k =k+1;
		}
		return k;
	}
}