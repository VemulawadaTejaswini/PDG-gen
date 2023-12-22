import java.io.*;
class Main{
	public static void main(String[] args){
		var kbd = new BufferedReader(new InputStreamReader(System.in));
		var txt = "";

		try{
			txt = kbd.readLine();
			kbd.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		var A = Integer.parseInt(txt.substring(0, txt.indexOf(" ")).strip());
		var B = Integer.parseInt(txt.substring(txt.indexOf(" "), txt.length()).strip());

		System.out.println(Math.max(Math.max(A - B, A + B), A * B));
	}
}
