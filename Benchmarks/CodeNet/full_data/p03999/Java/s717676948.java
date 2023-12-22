import java.util.*;

public class Main {
	static String N;
	public static long mama(int ini, int fina, long pepe) {
		if(fina>=N.length()&ini>=N.length())return pepe;
		if(fina>=N.length()) return mama(fina,fina,pepe+=Long.parseLong(N.substring(ini,fina)));
		return mama(fina,fina+1,pepe+Long.parseLong(N.substring(ini,fina)))+
				mama(ini,fina+1,pepe);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		N = scn.next();
		System.out.println(mama(0,1,0L));
		scn.close();
	}
}