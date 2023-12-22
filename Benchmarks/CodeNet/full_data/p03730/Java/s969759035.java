import java.util.*;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      	//aの倍数をfor文で回す↓
      	//総和をbで割りc余るか
      for(int i = 0; i < b; i++){
        int aTotal = a*(i+1);
        if(aTotal%b ==c){
        System.out.println("Yes");
        return;
        }
      }
        System.out.println("No");
     }
}