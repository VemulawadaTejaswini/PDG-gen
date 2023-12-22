import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        ArrayList<Integer>[] o=new ArrayList[N];
        ArrayList<Integer>[] w=new ArrayList[N];
        for(int i=0;i<N;i++){
            o[i]=new ArrayList<>();
            w[i]=new ArrayList<>();
        }

        for(int i=0;i<N-1;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int a=sc.nextInt();
            o[u-1].add(v-1);
            w[u-1].add(a);
            o[v-1].add(u-1);
            w[v-1].add(a);
        }
        char[] result=new char[2*N];
        boolean isEven=true;

        Stack<Integer> q=new Stack<>();
        q.add(0);
        Stack<Integer> s=new Stack<Integer>();
        s.add(0);
        Stack<Boolean> bool=new Stack<Boolean>();
        bool.add(true);
        int pos=0;
        int index=0;
        result[0]='0';
        while(q.size()!=0){
            if(result[o[pos].get(index)*2]==0){
                q.add(pos);
                s.add(index);
                bool.add(isEven);
                if((w[pos].get(index)%2==1)){
                    isEven=!isEven;
                }
                pos=o[pos].get(index);
                index=0;
                if(isEven){
                    result[pos*2]='0';
                }else{
                    result[pos*2]='1';
                }
                continue;
            }

            index++;
            if(index==o[pos].size()){
                index=s.pop();
                pos=q.pop();
                isEven=bool.pop();
            }

        }


        for(int i=0;i<N;i++){
            result[2*i+1]='\n';
        }
        System.out.print(new String(result));

    }
    static boolean isMonth(int a){
        return a>0&&a<13;
    }

}
