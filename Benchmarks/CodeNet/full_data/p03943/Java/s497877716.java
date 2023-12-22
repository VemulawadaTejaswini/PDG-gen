import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String str1 = br.readLine();
        String[] str2 = str1.split(" ", 0);
        int i[] = new int[3];
        String result;

        for(int j=0; j<3; j++) {
        	i[j] = Integer.parseInt(str2[j]);
        	//System.out.println(i[j]);
        }

       	if(i[0] == i[1]+i[2]) { result = "Yes"; }
       	else if(i[1] == i[2]+i[0]) { result = "Yes"; }
       	else if(i[2] == i[0]+i[1]) { result = "Yes"; }
       	else { result = "No"; }

       	System.out.println(result);
    }
}