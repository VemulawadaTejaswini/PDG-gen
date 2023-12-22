import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k=in.nextInt();

        List<Integer> A=new ArrayList<>();
        for(int i=0;i<n;i++)A.add(Integer.parseInt(in.next()));

        List<Integer> SA=new ArrayList<>();
        for(int i=A.size();i>0;i--){
            for(int j=0;j+i<=A.size();j++){
                int a=sumSubstring(A,j,i);
                SA.add(a);
            }
        }
        
        Combination C=new Combination(k,SA.size());
        // C.printList();
        List<List<Integer>> clist=C.getList();
        //System.out.println(clist.size());
        int max=SA.get(clist.get(0).get(0));
        for(int i=1;i<k;i++)max &= SA.get(clist.get(0).get(i));

        for(int i=0;i<C.l.size();i++){
            int and=SA.get(clist.get(i).get(0));
            for(int j=1;j<k;j++){
                and&=SA.get(clist.get(i).get(j));
            }

            if(and > max)max=and;
        }

        System.out.println(max);
    }

    static int sumSubstring(List<Integer> A,int startposition,int n){
        int res=0;
        for(int i=0;i<n;i++){
            res+=A.get(startposition+i);
        }

        return res;
    }
}

class Combination{
    List<List<Integer>> l=new ArrayList<>();
    boolean f[];

    Combination(int size,int maxnum){
        List<Integer> a=new ArrayList<>();
        f=new boolean[maxnum];
        build(a,0,size);
    }

    void build(List<Integer> A,int u,int max){
        
        for(int j=u;j<f.length;j++){
            if(!f[j]){
                A.add(j);
                f[j]=true;

                if(A.size()==max){
                    List<Integer> ad=new ArrayList<>(A);
                    l.add(ad);
                }
                else build(A,j+1,max);

                f[j]=false;
                A.remove(A.size()-1);
            }
        }
    }

    List<List<Integer>> getList(){
        //System.out.println("Combination size="+l.size());
        return l;
    }

    /*void printList(){
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }*/
}