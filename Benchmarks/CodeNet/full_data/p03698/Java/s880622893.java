import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		try{
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int count = 0;//countが1以上であればno
			for(int i=0;i<str.length()-1;i++){//iはスタート位置
				for(int j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}
				}
			}
			if(count>=1){
				System.out.println("no");
			}else{
				System.out.println("yes");
			}
		}catch(Exception e){}
	}

}
