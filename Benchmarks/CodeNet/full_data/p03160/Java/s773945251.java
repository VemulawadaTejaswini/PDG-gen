import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Frog {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null || !st.hasMoreElements())
            {
                try {
                    st=new StringTokenizer(br.readLine());
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return(Integer.parseInt(next()));
        }
        long nextLong()
        {
            return(Long.parseLong(next()));
        }
        String nextLine(){
            String s="";
            try{
                s=br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            return s;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(min_val(a,n-1,0));
    }
    static int min_val(int a[],int ind,int cost){
        if(ind==0){
            return cost;
        }
        if(ind-2>=0){
            return (Math.min(min_val(a,ind-2,cost+Math.abs(a[ind]-a[ind-2])),min_val(a,ind-1,cost+Math.abs(a[ind]-a[ind-1]))));
        }else{
            return (min_val(a,ind-1,cost+Math.abs(a[ind]-a[ind-1])));
        }
    }
}
