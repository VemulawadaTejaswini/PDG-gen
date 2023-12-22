import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String tmp = "";
		String dreamer = "";
		String dreamera[] = new String[10000];
		dreamera = s.split("eraser");
		for(int i = 0; i < dreamera.length / 2; i++){
			dreamer += dreamera[i];
		}
		String eraser = "";
		String erasera[] = new String[10000];
		erasera = dreamer.split("erase");
		for(int i = 0; i < erasera.length / 2; i++){
			 eraser += erasera[i];
		}
		String dream = "";
		String dreama[] = new String[10000];
		dreama = eraser.split("dream");
		for(int i = 0; i < dreama.length / 2; i++){
			 dream += dreama[i];
		}
		String erase = "";
		String erasea[] = new String[10000];
		erasea = dream.split("dreamer");
		for(int i = 0; i < erasea.length; i++){
			 erase += erasea[i];
		}
		erase += "*";
		if(erase.equals("*")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
