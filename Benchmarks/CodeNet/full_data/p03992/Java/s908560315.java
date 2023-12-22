import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String ret = "";
		int cnt = 0;
		while(true){
			ret += (char) (System.in.read());
			if (++cnt == 4) {
				ret += " ";
			}
			if (cnt >= 12) {
				break;
			}
		}
		System.out.println(ret);
	}
}