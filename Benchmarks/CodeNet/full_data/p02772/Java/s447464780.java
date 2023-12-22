import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] value = new int[n];
		int i=0;
		for (;i<value.length; i++){
			value[i] = sc.nextInt();
			if ((value[i]%2==0 && value[i]%3!=0) && (value[i]%2==0 && value[i]%5!=0)){
				break;
			}	//「偶数であるが、3でも5でも割り切れないもの」が出てきた時点でアウト、ループを抜ける
		}
		if (i==n){
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}	//全て条件を満たすときだけ上記ループを完遂するはず
		
    	}
  
}