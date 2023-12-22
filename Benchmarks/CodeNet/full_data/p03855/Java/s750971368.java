import java.util.*;
import java.io.*;
public class Main {
    
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int[] p=new int[k];
        int[] q=new int[k];
        int[] r=new int[l];
        int[] s=new int[l];
        for(int i=0;i<k;i++){
            st=new StringTokenizer(br.readLine());
            p[i]=Integer.parseInt(st.nextToken()) - 1;
            q[i]=Integer.parseInt(st.nextToken()) - 1;
        }for(int i=0;i<l;i++){
            st=new StringTokenizer(br.readLine());
            r[i]=Integer.parseInt(st.nextToken()) - 1;
            s[i]=Integer.parseInt(st.nextToken()) - 1;
        }
        
        List<int[]> miti_list=new ArrayList<>();
        dfs(0,p,q,new ArrayList<>(),miti_list);
        //for(int[] temp:miti_list) System.out.println(Arrays.toString(temp));
        
        //System.out.println();
        
        List<int[]> tetu_list=new ArrayList<>();
        dfs(0,r,s,new ArrayList<>(),tetu_list);
        //for(int[] temp:tetu_list) System.out.println(Arrays.toString(temp));
        
        int[] miti=new int[n];
        Arrays.fill(miti,0);
        for(int[] temp:miti_list){
            miti[temp[0]]=miti[temp[1]]=1;
        }
        int[] tetu=new int[n];
        Arrays.fill(tetu,0);
        for(int[] temp:tetu_list){
            if(miti[temp[0]]==1 && miti[temp[1]]==1){ tetu[temp[0]]=tetu[temp[1]]=2; }
            if(tetu[temp[0]]==0) tetu[temp[0]]=1;
            if(tetu[temp[1]]==0) tetu[temp[1]]=1;
        }for(int i=0;i<n;i++){
            if(i!=0) System.out.print(" ");
            if(tetu[i]>0) System.out.print(tetu[i]);
            else if(miti[i]>0) System.out.print(miti[i]);
            else System.out.print(0);
        }System.out.println();
    }
    
    static void dfs(int index,int[] start,int[] end,List<Integer> temp_hist,List<int[]> sum_list){
        if(index==n) return;
        List<Integer> hist=new ArrayList<>(temp_hist);
        for(int temp:hist){ if(!sum_list.contains(new int[]{temp,index})) sum_list.add(new int[]{temp,index}); }
        hist.add(index);
        for(int i=0;i<start.length;i++){
            if(start[i]==index){
                dfs(end[i],start,end,hist,sum_list);
            }
        }dfs(index+1,start,end,new ArrayList<>(),sum_list);
    }
}
