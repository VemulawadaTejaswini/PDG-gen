

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		byte[] b;
		String s = in.next();
		try{
			int count = 0;
			b = s.getBytes("US-ASCII");
			int[] mojiCount = new int[26];
			char[] chars = new char[s.length()];
			for(int i = 0; i < s.length(); i++){
				chars[i] = s.charAt(i);
			}
			for(int i = 1; i < b.length-1;i++){
				if(b[i] != b[i+1])mojiCount[(int)b[i]-97]++;
			}
			int max = 0;
			int maxID = 0;
			for(int i = 0; i < mojiCount.length; i++){
				if(max <= mojiCount[i]){
					max = mojiCount[i];
					maxID = i+97;
				}
			}
			byte[]bb = {(byte)maxID};
			char c = (new String(bb,"US-ASCII")).charAt(0);
			if(max == 0){
				count = 0;
			}else{
				do{
					char[] newChars = new char[chars.length-1];
					for(int i = 0; i < newChars.length; i++){
						if(chars[i+1] == c) newChars[i] = c;
						else newChars[i] = chars[i];
					}
					chars = newChars;
					count++;
				}while(isNotSame(c,chars));
			}
			System.out.println(count);
		}catch(Exception e){
			e.printStackTrace();
		}
		in.close();
	}
	boolean isNotSame(char c, char[] cs){
		for(char cc : cs){
			if(cc != c) return true;
		}
		return false;
	}

}
