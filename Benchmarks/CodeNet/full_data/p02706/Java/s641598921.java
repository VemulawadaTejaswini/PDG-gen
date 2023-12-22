import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

    public void main(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N=42;
        int M=2;
        int[] Ai = {5, 6};
        int Answer;
        for(int i=0; i<M; i++){
            Answer = N - Ai[i];
        }
        if(Answer < 0){
            System.out.println(-1);
        }else{
            System.out.println(Answer);
        }
    }
