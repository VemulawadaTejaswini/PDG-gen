import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine();

	int X = Integer.parseInt(str);

	find_max(2, 2, X, 1);
    }

    public static void find_max(int e, int x, int X, int max)
    {
	if(X == 1 || X == 2 || X == 3){
	    System.out.println(1);
	}else{
	    if(Math.pow((double) e, (double) x) <= (double) X){
		if(Math.pow((double) e, (double) x) > (double) max){
		    find_max(e, x+1, X, (int) Math.pow((double) e, (double) x));
		}else{
		    find_max(e, x+1, X, max);
		}
	    }else{
		if(Math.pow((double) (e+1), (double) 2) <= (double) X){
		    find_max(e+1, 2, X, max);
		}else{
		    System.out.println(max);
		}
	    }
	}
    }
}