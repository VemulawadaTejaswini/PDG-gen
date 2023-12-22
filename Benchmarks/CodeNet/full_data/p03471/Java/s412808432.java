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
	for(int i = num; i >= 0; i--){
		for(int j = i; j >= 0; j--){
			for(int k = j; k >= 0; k--){
				if(x+y+z == num && yen ==i*10000 + j*5000 + k*1000){
					System.out.println(x +" "+ y + " " + z);
					flg = true;
				}
			}
		}
	}
	if(!flg){
		System.out.println("-1 -1 -1");
	}
  }
}