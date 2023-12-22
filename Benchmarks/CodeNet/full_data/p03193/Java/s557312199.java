import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] aS = new String[3];
		String[] bS = new String[2];
		Integer n,h,w;
		Integer tempA, tempB,count=0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			aS = br.readLine().split(" ");
			n = Integer.valueOf(aS[0]);
			h = Integer.valueOf(aS[1]);
			w = Integer.valueOf(aS[2]);
			for(int i=0;i<n;i++) {
				bS = br.readLine().split(" ");
				tempA = Integer.valueOf(bS[0]);
				tempB = Integer.valueOf(bS[1]);
				if(tempA >= h && tempB >= w) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}