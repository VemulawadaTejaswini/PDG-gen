import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static private int sample = 0;
	static private InputStream in;
	static private PrintStream out;
	static private Scanner sc;
	static {
		if(sample == 0) {
			in = System.in;
			out = System.out;
		}else {
			try {
				in = new FileInputStream(new File("sample"+sample));
				out = new PrintStream("result"+sample);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
		sc = new Scanner(in);
	}
	static public boolean fileCompare2(String fileA, String fileB) {
		boolean bRet = false;
		try {
			bRet = Arrays.equals(Files.readAllBytes(Paths.get(fileA)), Files.readAllBytes(Paths.get(fileB)));
		} catch (IOException e) {
		}
		return bRet;
	}
	static public void exit() {
		if(sample!=0) {
			out.close();
			String sam = "sample"+sample;
			String ans = "answer"+sample;
			String res = "result"+sample;
			if(fileCompare2(ans, res)) {
				System.out.println("AC");
			}else {
				System.out.println("WA");
				try {
					System.out.println(new String(Files.readAllBytes(Paths.get(ans))));
					System.out.println(new String(Files.readAllBytes(Paths.get(res))));
					System.out.println(new String(Files.readAllBytes(Paths.get(sam))));
				} catch (IOException e) {
				}
			}
		}
		sc.close();
	}
	static public void main(String ...strings ) {
		try {
			final int N = sc.nextInt();
			final int A[] = new int[N];
			final int C[] = new int[N];
			for(int i=0;i<N;i++) {
				A[i] = sc.nextInt();
			}
			int color = 1;
			C[0] = A[0];
			for(int i=1;i<N;i++) {
				boolean ok = false;
				if(C[color-1] < A[i]) {
					for(int c=0;c<color;c++) {
						if(C[c] < A[i]) {
							C[c] = A[i];
							ok=true;
							break;
						}
					}
				}
				if(!ok) {
					C[color] = A[i];
					color++;
				}
			}
			out.println(color);
		} finally {
			exit();
		}
	}
}
