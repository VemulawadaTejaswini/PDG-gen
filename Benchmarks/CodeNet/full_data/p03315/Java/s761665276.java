import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		
		int result =0;
		// スペース区切りの整数の入力

		String[] fruits = a.split("");
        for (String fruit : fruits) {
                  if(fruit.equals("+")){result++;
}else{
result--;
}
        }




System.out.println(result);


	}
}