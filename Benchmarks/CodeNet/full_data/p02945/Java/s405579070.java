import java.io.*;
class Main{
	public static void main(String[] args){
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		String txt = "";

		try{
			txt = kbd.readLine();
			kbd.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		int A = Integer.parseInt(txt.substring(0, txt.indexOf(" ")).strip());
		int B = Integer.parseInt(txt.substring(txt.indexOf(" "), txt.length()).strip());

		System.out.println(Math.max(Math.max(A - B, A + B), A * B));
	}
}
