import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String sa = reader.readLine();
			String sb = reader.readLine();
			String sc = reader.readLine();
			char turn = 'a';
			char nextPerson;
			outer:while(true) {
				switch (turn) {
				case 'a':
					if (sa.length() > 0) {
						nextPerson = sa.charAt(0);
						turn = nextPerson;
						sa = sa.substring(1);
					} else {
						break outer;
					}
					break;
					
				case 'b':
					if (sb.length() > 0) {
						nextPerson = sb.charAt(0);
						turn = nextPerson;
						sb = sb.substring(1);
					} else {
						break outer;
					}
					break;
					
				case 'c':
					if (sc.length() > 0) {
						nextPerson = sc.charAt(0);
						turn = nextPerson;
						sc = sc.substring(1);
					} else {
						break outer;
					}
					break;
				}
			}
			
			System.out.println(String.valueOf(turn).toUpperCase());
			

		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
