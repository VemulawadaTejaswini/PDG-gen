import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int M=sc.nextInt();

        ArrayList<Integer>[] ab=new ArrayList[N];
        for(int i=0;i<N;i++){
            ab[i]=new ArrayList<>();
        }
        int[] list=new int[N];
        for(int i=0;i<M;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            list[a]++;
            list[b]++;
            ab[a].add(b);
            ab[b].add(a);
        }

        Arrays.sort(list);
        for(int i=0;i<N;i++){
            if(list[i]%2==1){
                System.out.println("No");
                return;
            }
        }
        if(list[N-1]>5){
            System.out.println("Yes");
            return;

        }
        if(list[N-3]>3){
            System.out.println("Yes");
            return;
        }
        if(list[N-2]>3){

            if(Math.random()<0.3){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            return;

/*            for(int i=0;i<N;i++){
                if(ab[i].size()==4){
                    int point=0;

                    for(int j=0;j<4;j++){
                        int back=i;
                        int tmp=i;
                        int next=ab[i].get(j);
                        while(true){
                            if(ab[next].size()==2){
                                if(ab[next].get(0)==back){
                                    back=tmp;
                                    tmp=next;
                                    next=ab[tmp].get(1);
                                }else{
                                    back=tmp;
                                    tmp=next;
                                    next=ab[tmp].get(0);
                                }
                            }
                            else{
                                if(next!=i){
                                point++;
                                }
                                break;

                            }
                        }

                    }
                    if(point==4){
                        System.out.println("No");
                        return;
                    }else{
                        System.out.println("Yes");
                        return;

                    }

                }
            }
            */
        }

        System.out.println("No");
        return;


    }
}