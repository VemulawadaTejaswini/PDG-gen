import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] caps = new String[num];
		caps = br.readLine().split(" ");
		int[] capsNum = new int[num];
		for(int i=0; i<num; i++){
			capsNum[i] = Integer.parseInt(caps[i]);
		}
		boolean notExor = false;
		for(int i=0; i<num; i++){
			if(i==0){
				if(capsNum[i] != (int)(capsNum[num-1]^capsNum[i+1])){
					notExor = true;
				}
			}else if(i == num-1){
				if(capsNum[i] != (int)(capsNum[0]^capsNum[i-1])){
					notExor = true;
				}
			}else{
				if(capsNum[i] != (int)(capsNum[i-1]^capsNum[i+1])){
					notExor = true;
				}
			}
		}
		if(notExor) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
