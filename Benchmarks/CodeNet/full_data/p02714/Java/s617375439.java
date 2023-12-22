import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String s=br.readLine();
        ArrayList<Integer> r=new ArrayList<Integer>();
        ArrayList<Integer> gr=new ArrayList<Integer>();
        ArrayList<Integer> bl=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            char ch=s.charAt(i);
            if(ch=='R') r.add(i);
            else if(ch=='G') gr.add(i);
            else bl.add(i);
        }
        int s1=r.size();
        int s2=gr.size();
        int s3=bl.size();
        long count=0;
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                int a=r.get(i);
                int b=gr.get(j);
                if(a>b){
                    a=a+b;
                    b=a-b;
                    a=a-b;
                }
                int c=a+b;
                int d=b-a;
                int e=(c%2==0)?c/2:-1;
                int f=a-d;
                int g=b+d;
                int co=0;
                if(Collections.binarySearch(bl,e)>=0) co++;
                if(Collections.binarySearch(bl,f)>=0) co++;
                if(Collections.binarySearch(bl,g)>=0) co++;
                count+=(s3-co);
            }
        }
        System.out.println(count);
    }
}
