import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
	 String a = sc.nextLine();
     int count = 0;
      
		// スペース区切りの整数の入力
		for(int i = 0; i < 4; i++){
            String tmp = a.substring(i,i+1);
            if(tmp.equals("+")){
                count++;
            }else{
                count--;
            }
        }
		System.out.println(count);
    }
}