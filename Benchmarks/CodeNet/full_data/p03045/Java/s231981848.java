import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        main:for(int i=0;i<M;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            for(int j=0;j<list.size();j++){
                if(list.get(j).contains(x)){
                    for(int k=0;k<list.size();k++) {
                        if(list.get(k).contains(y)){
                            if(j==k)continue main;
                            list.get(j).addAll(list.get(k));
                            list.remove(k);
                            continue main;
                        }
                    }

                }
                if(list.get(j).contains(y)){
                    for(int k=0;k<list.size();k++) {
                        if(list.get(k).contains(x)){
                            if(j==k)continue main;
                            list.get(j).addAll(list.get(k));
                            list.remove(k);
                            continue main;
                        }
                    }
                }
            }
           ArrayList<Integer> a=new ArrayList();
            a.add(x);
            a.add(y);
            list.add(a);
        }
        int result=0;
        test:
        for(int i=0;i<N;i++){
            for(int j=0;j<list.size();j++){
                if(list.get(j).contains(i)){
                    continue test;
                }
            }
            result++;
        }




        System.out.print(result+list.size());

    }
    static boolean isMonth(int a){
        return a>0&&a<13;
    }

}
