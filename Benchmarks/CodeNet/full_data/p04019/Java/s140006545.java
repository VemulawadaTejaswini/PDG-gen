import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		char[] coor = line.toCharArray();
		boolean[] verificacion = new boolean[4];
		Arrays.fill(verificacion, false);
		for (int i = 0; i < coor.length; i++) {
			if (coor[i] == 'N') {
				verificacion[0] = !verificacion[0];
			} else if (coor[i] == 'W') {
				verificacion[3] = !verificacion[3];
			} else if (coor[i] == 'S') {
				verificacion[1] = !verificacion[1];
			} else if (coor[i] == 'E') {
				verificacion[2] = !verificacion[2];
			}
		}
		if (line.contains("N") && line.contains("S") && line.contains("W") && line.contains("E")) {
			if (verificacion[0] && verificacion[1] && verificacion[2] && verificacion[3])
				System.out.println("Yes");
		} else if (line.contains("N") && line.contains("S") && !line.contains("W") && !line.contains("E")) {
			if (verificacion[0] && verificacion[1])
				System.out.println("Yes");
		} else if (!line.contains("N") && !line.contains("S") && line.contains("W") && line.contains("E")) {
			if (verificacion[2] && verificacion[3])
				System.out.println("Yes");
		} else
			System.out.println("No");

	}

}
