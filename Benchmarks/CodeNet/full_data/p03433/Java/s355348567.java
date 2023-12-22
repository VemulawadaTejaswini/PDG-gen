import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();	//払いたいお金
      	int b = scan.nextInt();	//一円玉の個数
      	int v = a % 500; //500で割ったときのあまり
      	if(1 <= a && a <= 10000 && 0 <= b && b <= 100){
      		if(b >= v){ //あまりが一円玉で払えたらオッケ
        		System.out.print("YES");
        	}
      		else{
        		System.out.print("NO");
        	}
        }
      
      	
    }
 
}