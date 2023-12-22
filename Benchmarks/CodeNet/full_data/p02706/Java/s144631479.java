    public int main(int N,int M){
        N=42;
        M=2;
        int[] Ai = {5, 6};
        int Answer;
        for(int i=0; i<M; i++){
            N = N - Ai[i];
        }
        if(N < 0){
            N = -1;
        }
        return N;
    }