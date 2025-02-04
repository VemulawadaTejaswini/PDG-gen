import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String dream = "dream";
		String dreamer = "dreamer";
		String erase = "erase";
		String eraser = "eraser";

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		StringBuilder t = new StringBuilder(s);

		boolean yes = true;

		while(true) {
			int indexDream =  t.indexOf(dream);
			int indexDreamer = t.indexOf(dreamer);
			int indexErase = t.indexOf(erase);
			int indexEraser = t.indexOf(eraser);

			if(indexDream == 0) {
				t.delete(0, dream.length());
			} else if(indexDreamer == 0){
				t.delete(0, dreamer.length());
			} else if(indexErase == 0) {
				t.delete(0, erase.length());
			} else if(indexEraser == 0) {
				t.delete(0, eraser.length());
			} else {
				yes = false;
				break;
			}

			if(t.length() == 0) {
				break;
			}
		}

		if(yes == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
