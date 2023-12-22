import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int tc=1;
    static String[] s;
 
    public static long[] ila(String[] s){
        long[] array=new long[s.length];
        for(int i=0;i<array.length;i++)
            array[i]=Long.parseLong(s[i]);
        return array;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //tc=Integer.parseInt(br.readLine());
        t:
        while(tc-->0){
		  String[] days={"SUN","MON","TUE","WED","THU","FRI","SAT"};
		  ArrayList<String> al=new ArrayList<>();
		  for(int i=0;i<days.length;i++){
		  	al.add(days[i]);
		  }
		  String str=br.readLine();
		  int x=al.indexOf(str);
		  int ans=7-x;
		  if(ans==0)
			System.out.println(7);
		  else
			System.out.println(ans);
        }
    }
}