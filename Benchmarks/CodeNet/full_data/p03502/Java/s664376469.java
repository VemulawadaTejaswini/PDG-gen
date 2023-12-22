import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int div = 1;
        int nlength =String.valueOf(n).length();
        for(int i = 0; i > nlength; i++){
            sum = (n / div) / 10 + sum;
            div = div * 10;
        }
        if(n / sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
		
	}
}