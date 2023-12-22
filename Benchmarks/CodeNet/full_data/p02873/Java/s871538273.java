import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String N_i[] = N.split("");
		int count = 0;
		int sub = 0;
		int tmp_c = 1;
		String tmp = N_i[0];
		for(int i = 1; i < N_i.length; i++) {
			String s = N_i[i];
			if(tmp.equals(s)) {
				tmp_c++;
				if(i == N_i.length-1) {
					if(tmp_c !=1) {
						count = count+(tmp_c*(tmp_c+1))/2;
					}else {
						tmp_c--;
						count = count+(tmp_c*(tmp_c+1))/2;
					}
				}
			}else {
				if(tmp_c !=1) {
					if(tmp_c<sub && tmp.equals(">")) {
						tmp_c--;
						count = count+(tmp_c*(tmp_c+1))/2;
					}else {
						count = count+(tmp_c*(tmp_c+1))/2;
					}
				}else {
					if(tmp.equals(">")) {
						count = count+(tmp_c*(tmp_c+1))/2;
					}else {
						tmp_c--;
						count = count+(tmp_c*(tmp_c+1))/2;
					}
					
					if(i==N_i.length-1 && s.equals("<")) {
						count = count+(tmp_c*(tmp_c+1))/2;
					}
				}
				sub = tmp_c;
				tmp_c = 1;
				//System.out.println(count);
			}
			tmp = s;
		}
		System.out.println(count);
	}

}
