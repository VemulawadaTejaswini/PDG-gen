import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.equals("a")||str.equals("i")||str.equals("u")||str.equals("e")||str.equals("o")){
			System.out.println("vowel");
		}
		else System.out.println("consonant");
	}
}