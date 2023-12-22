
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String split[] = input.split("");
		int n = input.length();
		int in[] = new int[n];
		int count1 =0;
		int count2 =0;
		for(int i =0;i<n;i++) {
			in[i] = Integer.parseInt(split[i]);
		}

		for(int j =0;j<n;j++) {
			if(j%2==0) {
				if(in[j]==1) {
					count1++;
				}
			}else {
				if(in[j]==0) {
					count1++;
				}
			}
		}

		for(int k =0;k<n;k++) {
			if(k%2==0) {
				if(in[k]==0) {
					count2++;
				}
			}else {
				if(in[k]==1) {
					count2++;
				}
			}
		}
		if(count2>=count1) {
			System.out.println(count1);
		}else {
			System.out.println(count2);
		}
	}

}
