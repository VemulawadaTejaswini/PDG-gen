
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 連続した部分文字列がkの長さをもつとすると
	// aa
	// a*a
	// のどちらかしか存在しない。このパターンを使わないということはa**a**q...と繰り返すことになるがこの方法では条件をみたすことはないからである
	//テスト
	//asdfghjklaa : 最後だけ
	//faewasdfala
	//qwertyuioaa
	//aaqwertyuiop:最初
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String text[] = line.split("");
		int N = text.length;

		boolean flg = false;

		for (int i = 0; i < text.length - 2; i++) {
			if (text[i].equals(text[i + 1])) {
				i++;
				System.out.println(i + " " + (i + 1));
				flg = true;
				break;
			}
			else if (text[i].equals(text[i + 2])) {
				i++;
				System.out.println(i + " " + (i + 2));
				flg = true;
				break;
			}
		}
		
		
		if (N == 2 && text[0].equals(text[1])) {

			System.out.println("1 2");
			flg = true;

		}else if(text[N-2].equals(text[N-1])){
			System.out.println((N-2) + " " + (N-1));
			flg = true;
		}
		
		if (!flg) {
			System.out.println("-1 -1");
		}
	}
}
