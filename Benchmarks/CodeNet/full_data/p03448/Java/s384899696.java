import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int a,b,c,x;
	int res = 0;

	Scanner sc = new Scanner(System.in);
	a = sc.nextInt(); //500円玉の枚数
 	b = sc.nextInt(); //100
	c = sc.nextInt(); //50
	x = sc.nextInt(); //目標金額
    

    
	for(int i = 0; i <= a; i++){
	    // System.out.println("1");
	    for(int j = 0; j <= b; j++){
		//	System.out.println("2");
		for(int k = 0; k <= c; k++){
		    //    System.out.println("3");
		    int total = 500 * a + 100 * b + 50 * c;
		    if(total == x){
			++res;
		    }
		}
	    }
	}
	

	System.out.println(res);
	
    }
}
