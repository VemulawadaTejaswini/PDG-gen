//created by Whiplash99
import java.io.*;
import java.util.*;
import java.util.function.BiPredicate;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        ArrayDeque<Long> Q=new ArrayDeque<>();
        ArrayList<Long> list=new ArrayList<>();

        for(i=1;i<=9;i++) Q.add(i+0l);

        int lim=(int)(1e5+10);
        while (lim-->0)
        {
            long num=Q.poll();
            long d=num%10;

            list.add(num);
            if(d>0) Q.add(num*10+d-1);
            Q.add(num*10+d);
            if(d<9) Q.add(num*10+d+1);
        }

        System.out.println(list.get(Integer.parseInt(br.readLine().trim())-1));
    }
}