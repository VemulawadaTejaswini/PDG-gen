import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        HashMap<Integer,Integer> d=new HashMap<>();
        int[] result=new int[N];
        int[] A=new int[N-1];
        int[] B=new int[N-1];
        ArrayList<Integer>[] aaa=new ArrayList[N];
        for(int i=0;i<N;i++){
            aaa[i]=new ArrayList<Integer>();
        }

        int[] c=new int[N];
        for(int i=0;i<N-1;i++){
            int a=in.nextInt()-1;
            A[i]=a;
            int b=in.nextInt()-1;
            B[i]=b;
            aaa[a].add(b);
            aaa[b].add(a);

        }
        boolean[] already=new boolean[N];
        for(int i=0;i<N;i++){
            c[i]=in.nextInt();
            already[i]=false;
        }
        Arrays.sort(c);
        Stack<Integer> pos=new Stack<>();
        Stack<Integer> index=new Stack<>();
        int p=0;
        int i=0;
        pos.add(0);
        index.add(0);
        int r=0;
        already[0]=true;

        while(!pos.empty()){
            if(aaa[p].size()==i){
                result[p]=c[r];
                r++;
                p=pos.pop();
                i=index.pop()+1;
                continue;
            }
            if(already[aaa[p].get(i)]){
                i++;
                continue;
            }
            pos.push(p);
            p=aaa[p].get(i);
            already[p]=true;
            index.push(i);
            i=0;
        }

        int sum=0;
        for(int t=0;t<N-1;t++){
            sum+=c[t];
        }
        StringBuilder bu=new StringBuilder("");
        bu.append(sum);
        bu.append("\n");
        for(int t=0;t<N;t++) {
            bu.append(result[t]);
            bu.append(" ");
        }
        System.out.println(new String(bu));

    }
}
