import java.io.*;
import java.util.Arrays;

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	String str = br.readLine();

	String[] sl = str.split(" ");

	int[] il = new int[sl.length];

	for(int i=0; i<il.length; i++){
	    il[i] = Integer.parseInt(sl[i]);
	}

	if(Math.abs(il[0] - il[2]) <= il[3]){
	    System.out.println("Yes");
	}
	else if(Math.abs(il[0] - il[1]) <= il[3] && Math.abs(il[1] - il[2]) <= il[3]){
	    System.out.println("Yes");
	}
	else{
	    System.out.println("No");
	}
    }
}