import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		// 楽曲数を取得
		int songCount = scanner.nextInt();

		// 楽曲リストを取得
		List<Object[]> songList = new ArrayList<Object[]>();
		while (songCount > 0) {
			songList.add(new Object[] {scanner.next(), scanner.nextInt()});
			songCount--;
		}

		// 寝落ちしたタイミングの曲名を取得(該当曲の再生時間は含まない)
		String neotiSong = scanner.next();

		scanner.close();

		// 寝落ち後の再生時間を取得
		boolean neotiFlg = false;
		int sleepTime = 0;
		while (songCount < songList.size()) {
			if (neotiFlg) {
				sleepTime += (int) songList.get(songCount)[1];
				songCount ++;
				continue;
			}
			if (neotiSong.equals(songList.get(songCount)[0])) {
				neotiFlg = true;
				songCount ++;
				continue;
			}
			songCount ++;
		}

		// 寝落ち後の再生時間を出力
		System.out.println(sleepTime);
	}

}