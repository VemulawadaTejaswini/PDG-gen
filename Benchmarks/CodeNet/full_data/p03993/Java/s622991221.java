import java.io.*;
import java.util.*;
public class Main{
    public static void main (String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }int count=0;
        for(int i=0;i<n;i++){
            if(array[i]<array[array[i]-1]){
                //System.out.println(array[i]+" "+array[array[i]-1]);
                if(array[array[array[i]-1]-1]==array[i]) count++;
            }
        }System.out.println(count);
    }
    
}