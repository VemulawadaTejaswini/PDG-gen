import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		/*
	int n = Integer.parseInt(args[0]);
	int a = Integer.parseInt(args[1]);
	int b = Integer.parseInt(args[2]);
*/
	String alis = "Alice";
	String borys = "Borys";
	String draw = "Draw";
	// マス作成
	List<String> list = new ArrayList<String>();
	for( int i = 1; i <= n; i++){
		String s = "";
		if (i == a){
			s = alis;
		}else if(i == b){
			s = borys;
		}
		list.add(s);
	}
	System.out.println("listのサイズ：" + list.size());
	
	String winer = draw;
	boolean flg = true;
	int count = 0;
	while(flg){
		// Alice move
		int aliceIndex = list.indexOf(alis);
		if (list.get(aliceIndex + 1).equals("")){
			// move '+1'
			movePlayer(aliceIndex, aliceIndex + 1, alis, list);
		}else if(aliceIndex == 0){
			// lose
			winer = borys;
			flg = false;
			break;
		}else if( list.get(aliceIndex - 1).equals("")){
			// move '-1'
			movePlayer(aliceIndex, aliceIndex - 1, alis, list);
		}else{
			// lose
			winer = borys;
			flg = false;
			break;
		}
		// Borys move
		int borysIndex = list.indexOf(borys);
		if (list.get(borysIndex - 1).equals("")){
			// move '-1'
			movePlayer(borysIndex, borysIndex - 1, borys, list);
		}else if(borysIndex == n - 1){
			// lose
			winer = alis;
			flg = false;
			break;
		}else if(list.get(borysIndex + 1).equals("")){
			// move '+1'
			movePlayer(borysIndex, borysIndex + 1, borys, list);
		}else{
			// lose
			winer = alis;
			flg = false;
			break;
		}
		count++;
		System.out.println("count: " + count);
		if (count == n){
			flg = false;
		}
	}
	
	// 確認
	System.out.println("マスの数" + list.size());
	System.out.println(winer);		
	}
	
	public static void movePlayer(int beforeIndex, int moveIndex, String player, List<String> list){
		list.set(beforeIndex, "");
		list.set(moveIndex, player);
	}
	
}
