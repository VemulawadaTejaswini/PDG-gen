import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Pair bc[] = new Pair[M];
        for(int i=0; i<M; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            bc[i] = new Pair(c,b);
        }

        //PairSort.sortdf(bc,0,bc.length-1);
        long sum = 0;
        int i=0;
            for(int j=0; j<M && i<N; j++){
                for(int k=0; k<bc[j].second && i<N;k++){
                    int c = bc[j].first;
                    if(A[i] < c){
                        sum += c;
                    } else {
                        sum += A[i];
                    }
                    i++;
                }
            }
        for(int j=i; j<N; j++) {
            sum += A[j];
        }


        System.out.println(sum);
    }
}

//import java.util.*;

class Pair {
    public int first;
    public int second;

    Pair(){
        this.first = 0;
        this.second = 0;
    }
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
    
    public void setFirst(int n) {
        this.first = n;
    }
    public void setSecond(int n) {
        this.second = n;
    }
}

class PairSort {
    static int pivotdf(Pair a[], int i,int j){
        int k=i+1;
        while(k<=j && a[i].first==a[k].first) k++;
        if(k>j) return -1;
        if(a[i].first<=a[k].first) return i;
        return k;
    }
    static int partitiond(Pair a[], int i, int j, Pair x){
        int l=i, r=j;
        while(l<=j){
            while(l<=j && a[l].first>x.first) l++;
            while(r>=i && a[r].first<=x.first) r--;
            if(l>r) break;
            Pair t = a[l];
            a[l]=a[r];
            a[r]=t;
            l++; r--;
        }
        return l;
    }
    public static void sortdf(Pair a[],int i,int j){
        if(i==j) return;
        int p=pivotdf(a,i,j);
        if(p!=-1){
            int k=partitiond(a,i,j,a[p]);
            sortdf(a,i,k-1);
            sortdf(a,k,j);   
        }
    }
}

