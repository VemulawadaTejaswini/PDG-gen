import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		StringBuilder[] sbarr = new StringBuilder[w];
		int count = 0;
		for (int i = 0; i < h; i++) {
			String x = sc.next();
			if (x.contains("#")) {
				count++;
				for (int j = 0; j < w; j++) {
					if (sbarr[j] == null) {
						sbarr[j] = new StringBuilder();
					}
					sbarr[j].append(x.charAt(j));
				}
			}
		}
		StringBuilder[] outputs = new StringBuilder[count];
		for (int i = 0; i < w; i++) {
			if (sbarr[i].toString().contains("#")) {
				for ( int j = 0; j < count; j++) {
					if (outputs[j] == null) {
						outputs[j] = new StringBuilder();
					}
					outputs[j].append(sbarr[i].charAt(j));
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (StringBuilder output : outputs) {
			sb.append(output).append("\n");
		}
			
		System.out.print(sb);
	}
}