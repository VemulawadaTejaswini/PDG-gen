import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n項目
		long c=0;
		
		for(int i=1;i<=n;i++) {
			
			// 3の倍数かつ、5の倍数の場合
		    if (i%3==0&&i%5==0) {
		    	
		    }
		     
		    // 3の倍数の場合
		    else if (i%3==0) {
		    	
		    }
		     
		    // 5の倍数の場合
		    else if (i%5==0) {
		    	
		    }
		     
		    // いずれでもない場合
		    else {
		    	c=c+i;
		     }
		   }
		 System.out.println(c);
		sc.close();
	}

}
