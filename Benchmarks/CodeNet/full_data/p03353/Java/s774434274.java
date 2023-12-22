import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int jyunban=0;
		List<String> jisyo=new ArrayList<String>();
		int jisyosuu=0;
		char[] alpa=new char[26];
		alpa[0]='a';
		alpa[1]='b';
		alpa[2]='c';
		alpa[3]='d';
		alpa[4]='e';
		alpa[5]='f';
		alpa[6]='g';
		alpa[7]='h';
		alpa[8]='i';
		alpa[9]='j';
		alpa[10]='k';
		alpa[11]='l';
		alpa[12]='m';
		alpa[13]='n';
		alpa[14]='o';
		alpa[15]='p';
		alpa[16]='q';
		alpa[17]='r';
		alpa[18]='s';
		alpa[19]='t';
		alpa[20]='u';
		alpa[21]='v';
		alpa[22]='w';
		alpa[23]='x';
		alpa[24]='y';
		alpa[25]='z';

		try {
			str=bfr.readLine();
			jyunban=Integer.parseInt(bfr.readLine());

			for(int alphabt=0; alphabt<26; alphabt++) {
				for(int mojis=1; mojis<=Math.min(str.length(),5); mojis++) {
					if(jisyosuu<=jyunban) {		// 辞書に登録された文字列数が知りたい順番を超えるまで
						for(int ichi=0; ichi<=str.length()-mojis; ichi++) {
							if(chartoint(str.charAt(ichi))==alphabt) {
								if(jisyosuu==0) {
									jisyo.add(str.substring(ichi, ichi+mojis));
									jisyosuu++;
								}
								else {
									if(jisyo.contains(str.substring(ichi, ichi+mojis))==false) {
										jisyo.add(str.substring(ichi, ichi+mojis));
										jisyosuu++;
									}
								}
							}
						}
					}
					else {
						mojis=6;
						break;
					}
				}
			}
			Collections.sort(jisyo);
			System.out.println(jisyo.get(jyunban-1));
		}catch(IOException e) {

		}
		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}
	}

	static int chartoint(char a) {
		char[] alpa=new char[26];
		int kekka=0;
		alpa[0]='a';
		alpa[1]='b';
		alpa[2]='c';
		alpa[3]='d';
		alpa[4]='e';
		alpa[5]='f';
		alpa[6]='g';
		alpa[7]='h';
		alpa[8]='i';
		alpa[9]='j';
		alpa[10]='k';
		alpa[11]='l';
		alpa[12]='m';
		alpa[13]='n';
		alpa[14]='o';
		alpa[15]='p';
		alpa[16]='q';
		alpa[17]='r';
		alpa[18]='s';
		alpa[19]='t';
		alpa[20]='u';
		alpa[21]='v';
		alpa[22]='w';
		alpa[23]='x';
		alpa[24]='y';
		alpa[25]='z';
		for(int i=0; i<26; i++) {
			if(a==alpa[i]) {
				kekka=i;
				break;
			}
		}
		return kekka;
	}
}