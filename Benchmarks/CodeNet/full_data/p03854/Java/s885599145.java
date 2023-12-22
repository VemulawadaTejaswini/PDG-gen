import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String line = buff.readLine();
		String[] box = {"dreamer", "eraser", "dream", "erase"};
		while(true){
			boolean str_flag = true;
			for(int i = 0; i < box.length; ++i){
				if(line.endsWith(box[i])){
					//System.out.println("line : " + line + " box[i] : " + box[i]);
					line = line.substring(0, line.length() - box[i].length());
					//System.out.println("replace line : " + line);
					str_flag = false;
				}
			}
			if(line.length() == 0){
				System.out.println("YES");
				break;
			}
			if(str_flag){
				System.out.println("NO");
				break;
			}
		}
	}

	static long f() {
		long ans = 0;

		return ans;
	}
}