import java.util.*;
public class Slimes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int number = sc.nextInt();
    String slimes = sc.next();

    int total = 1;
    String first = slimes.substring(0,1);
    for(int i = 1; i < slimes.length(); i++){
      if(!(first.equals(slimes.substring(i,i+1)))){
        first = slimes.substring(i,i+1);
        total++;
      }
    }
		System.out.println(total);
	}
}