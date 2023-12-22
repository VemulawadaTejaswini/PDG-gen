    import java.util.*;
	import java.lang.Math;
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
			String original="";
			original=scan.nextLine();
			int count=0;
			int len=original.length();
			for(int i=0;i<len/2;i++)
			{
				if(original.charAt(i)==original.charAt(len-1-i))
				{}
				else
					count++;
			}
			System.out.println(count);
    	}
    }