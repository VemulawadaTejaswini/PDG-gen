import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> u=new ArrayList<>(N-1);
        ArrayList<Integer> v=new ArrayList<>(N-1);
        ArrayList<Integer> w=new ArrayList<>(N-1);

        for(int i=0;i<N-1;i++){
            u.add(sc.nextInt());
            v.add(sc.nextInt());
            w.add(sc.nextInt());
        }

        int[] dist=new int[N];
        for(int i=0;i<N;i++){
            dist[i]=-1;
        }
        dist[0]=0;
        while(w.size()!=0){
            for(int i=0;i<w.size();i++){
                if(dist[u.get(i)-1]>=0){
                    dist[v.get(i)-1]=dist[u.get(i)-1]+w.get(i);
                    v.remove(i);
                    u.remove(i);
                    w.remove(i);
                    break;
                }
                if(dist[v.get(i)-1]>=0){
                    dist[u.get(i)-1]=dist[v.get(i)-1]+w.get(i);
                    v.remove(i);
                    u.remove(i);
                    w.remove(i);
                    break;
                }
            }
        }
        char[] result=new char[2*N];
        for(int i=0;i<N;i++){
            if(dist[i]%2==0) {
                result[2 * i] ='0';
            }else{
                result[2 * i] ='1';
            }
            result[2*i+1]='\n';
        }
        System.out.print(new String(result));

    }
    static boolean isMonth(int a){
        return a>0&&a<13;
    }

}
