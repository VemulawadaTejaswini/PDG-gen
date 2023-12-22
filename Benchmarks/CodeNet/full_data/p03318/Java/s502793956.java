import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String str = String.valueOf(N);
		int K = 0;

		for(int i = 0; i < str.length(); i++){
			K += Integer.parseInt(str.substring(i, i+1));
		}

		String tmp = String.valueOf(K);
		int level = tmp.length()-1;

		for(long i = 0; i < N;i++){
			System.out.println(tmp);

			if(Integer.parseInt(tmp.substring(level,level+1)) != 9){
				if(tmp.length()>1){
					tmp = tmp.substring(0,level) + String.valueOf((Integer.parseInt(tmp.substring(level,level+1))+1))
						+ tmp.substring(level+1,tmp.length());
				}else{
					tmp = String.valueOf((Integer.parseInt(tmp.substring(level,level+1))+1));
				}

			}else{
				if(level == 0){
					if(tmp.length() < 16)
						tmp = "1" + tmp;
				}else{
					level--;
				}

			}
		}
	}
}
