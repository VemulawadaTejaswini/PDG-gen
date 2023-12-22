import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  num = sc.nextInt();
	int  yen = sc.nextInt();
	int x =0;
	int y = 0;
	int z = 0;
	boolean flg = false;
    
	wada: for(int i = 0; i <= num; i++){
		for(int j = 0; j <= num-i; j++){
			x = i;
			y = j;
			z = num -(x+y);
			if(x+y+z == num && yen ==x*10000 + y*5000 + z*1000){
				System.out.println(x +" "+ y + " " + z);
				flg = true;
              	break wada;
			}
		}
	}
	if(!flg){
		System.out.println("-1 -1 -1");
	}
  }
}
