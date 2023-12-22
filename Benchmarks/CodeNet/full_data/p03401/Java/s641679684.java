import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cost=0;
        int ans = 0;
        int N = sc.nextInt();
        //String[] str = new String[N];
        int[] A = new int[N+2];
        A[0]=0;
        for (int i=1;i<=N;i++){
        //    str[i]=sc.next();
            A[i]=sc.nextInt();
        }
        A[N+1]=0;
        sc.close();


        //for(int i=0;i<N;i++){

            /*List<String> list = new ArrayList<>(Arrays.asList(str));
            list.remove(i);
            str  = list.toArray(new String[list.size()]);
            for(int j=0;j<N-1;j++){
                A[j] = Integer.parseInt(str[j]);
            }*/
            
            for(int k=1;k<=N;k++){
                //if(k!=0){
                    int tmp = Math.abs(A[k-1]-A[k]);
                    cost+=tmp;
                //}
                /*else{
                    cost = (A[k]>0)?A[k]:-A[k];
                }*/
            }
            cost+=Math.abs(A[N]);
            //System.out.println(cost);

            for(int i=1;i<=N;i++){
                ans = cost+Math.abs(A[i-1]-A[i+1])-Math.abs(A[i]-A[i-1])-Math.abs(A[i]-A[i+1]);
                System.out.println(ans);
            }
        //}
    }
}