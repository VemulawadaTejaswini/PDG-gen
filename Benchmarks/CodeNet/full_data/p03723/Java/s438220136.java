import java.io.*;
public class Main
{
	public static void main(String args[])
    {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    try {
		    String[] str = br.readLine().split(" ");

		    int a, b, c;
		    a = Integer.parseInt(str[0]);
		    b = Integer.parseInt(str[1]);
		    c = Integer.parseInt(str[2]);
		    
		    int count = 0;
		    if(a == b && b == c){
			count = -1;
		    }else{
			while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
			    int buf_a, buf_c=0;
			    buf_a = b/2 + c/2;
			    buf_c = a/2 + b/2;
			    b = a/2 + c/2;
			    a = buf_a;
			    c = buf_c;
			    count++;
			}
		    }

			System.out.println(count);
		} catch (Exception e) {
			// System.out.println(e);
        }
	}
}

