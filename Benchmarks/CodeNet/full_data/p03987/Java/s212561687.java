import java.io.*;             
         
public class Main {
    public static void main(String[] args){
         
	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
         
	try{
	    String str1 = reader1.readLine();
	    String str2 = reader2.readLine();
	    int N = Integer.parseInt(str1);
	    String[] s_array = str2.split("\\s");
	    long[] array = new long[N];
         
	    for(int i = 0 ; i < s_array.length ; i++)
		array[i] = Long.parseLong(s_array[i]);
         
	    long sum = 0 ;
	    long min;
	    for(int l = 0; l < N ; l++){
		min = array[l];		     
		for(int r = l; r < N ; r++){
		    if (array[r] < min) {
			min = array[r];
		    }
		    sum += min;
		}
	    }
         
	    System.out.println(sum);
         
	}catch (IOException e){
	    System.out.println(e);
	}
    }
}