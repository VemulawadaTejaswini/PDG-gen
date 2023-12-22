import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int sum,i;
		for(i=1;i<=a;i++){
			if(i%3!=0&&i%5!=0) {
				sum+=i;
			}
        }
      System.out.println(sum);
	}
}