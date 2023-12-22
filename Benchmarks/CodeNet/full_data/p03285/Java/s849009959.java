import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int amari = n%28;

		boolean flag= isflag(amari);
		if(flag){

			System.out.println("Yes");
		}else {
			amari=amari-7;

				if(amari>0&&isflag(amari)){
					System.out.println("Yes");
				}else {
					amari=amari-7;

						if(amari>0&&isflag(amari)){
							System.out.println("Yes");
						}else {
							amari=amari-7;

							if(amari>0&&isflag(amari)){
								System.out.println("Yes");
							}else {
								System.out.println("No");		
							}
						}
				}
		}




	}

	public static boolean isflag(int amari) {
		boolean flag =false;
		if(amari == 4){
			flag=true;
		}else if(amari == 4){
			flag=true;
		}else if(amari %4==0){
			flag=true;
		}else if(amari %7==0){
			flag=true;
		}else if(amari %7==4){
			flag=true;
		}
		return flag;
	}

}