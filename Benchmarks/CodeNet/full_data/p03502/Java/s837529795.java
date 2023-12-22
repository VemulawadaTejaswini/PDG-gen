import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int = div;
        int nlength =String.valueOf(n).length();
        for(int i = 0; i > nlength; i++){
            div = div * 10;
            sum = n / div + sum;
        }
        if(n / sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
		
	}
}