import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int t = sc.nextInt();
		// スペース区切りの整数の入力
		for(int i=1;i<=t;i++){

			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			//最初在庫A弧ある
			//B個毎日減る
			//もしC個以下なら補充
			//D個足される

			//そもそもD＜BならNo
			//A<B No
			//C＞＝BならYes
			if(a<b){
				// 初日で在庫尽きる
				System.out.println("No");
			}else if(d<b){
				// 補充が追いつかないならいつかダメ
				System.out.println("No");
			}else if(c>=b){
				// 発注点が余裕あるから大丈夫
				System.out.println("Yes");
			}else{
				// 発注点が消費量より小さい場合
			//D=Bの場合、
				// AをBで割った余りは、マイナスになる一歩手前の在庫数
				// これが発注点を超えているか否かで判定可能
				if(d==b){
					long remainQ = a%b;
				if(remainQ<=c){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}else{
								//D>Bの場合、発注点近くまで近づいてから判定
			// つまりある程度在庫を削ってから判定する

				// 任意のタイミングでgoods>cかつgoods<bとなる時があるはず
				// そのタイミングが出るならNo,全くでないならYes

				long goods = a;
				while(goods>c){
					goods = goods -b;
// System.out.println("goodsRemain" + goods);
				}

				// System.out.println("zaiko" + goods);
				if(goods<0L){
					goods = goods+b;
				}
				// 	if(goods<=c){
				// 		System.out.println("Yes");
				// 	}else{
				// 		System.out.println("No");
				// 	}
				// }else{
					if(goods<=c){
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
				// }
			}

				
			}

						// System.out.println(i);
		}


	}
}