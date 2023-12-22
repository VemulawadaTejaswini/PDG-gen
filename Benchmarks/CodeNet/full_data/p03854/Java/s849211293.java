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
		for(int i = 0; i < 10; i++){
			dreamera[i] = " ";
		}
		dreamera = s.split("eraser");
		for(int i = 0; i < dreamera.length; i = i + 2){
			tmp = dreamera[i] + dreamera[i + 1];
			dreamer += tmp;
		}
		if(dreamera.length / 2 != 0){
			dreamer += dreamera[dreamera.length - 1];
		}
		String eraser = "";
		String erasera[] = new String[10000];
		for(int i = 0; i < 10; i++){
			erasera[i] = " ";
		}
		erasera = dreamer.split("erase");
		for(int i = 0; i < erasera.length / 2; i = i + 2){
			tmp = erasera[i] + erasera[i + 1];
			eraser += tmp;
		}
		if(erasera.length / 2 != 0){
			eraser += erasera[dreamera.length - 1];
		}
		String dream = "";
		String dreama[] = new String[10000];
		for(int i = 0; i < 10; i++){
			dreama[i] = " ";
		}
		dreama = eraser.split("dream");
		for(int i = 0; i < dreama.length; i = i + 2){
			tmp = dreama[i] + dreama[i + 1];
			dream += tmp;
		}
		if(dreama.length / 2 != 0){
			dream += dreama[dreamera.length - 1];
		}
		String erase = "";
		String erasea[] = new String[10000];
		for(int i = 0; i < 10; i++){
			erasea[i] = " ";
		}
		erasea = dream.split("dreamer");
		for(int i = 0; i < erasea.length; i = i + 2){
			tmp = erasea[i] + erasea[i + 1];
			erase += tmp;
		}
		if(erasea.length / 2 != 0){
			erase += erasea[dreamera.length - 1];
		}
		erase += "*";
		if(erase.equals("*")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
