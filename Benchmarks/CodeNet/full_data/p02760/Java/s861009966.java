import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);

        int[] A = new int[9];
        for(int y=0;y<3;y++){
            for(int x=0;x<3;x++){
                A[y*3+x] = Integer.parseInt(SC.next());
            }
        }

        int N = Integer.parseInt(SC.next());
        boolean[] C = new boolean[9];
        for(int i=0;i<N;i++){
            int b = Integer.parseInt(SC.next());
            for(int j=0;j<9;j++){
                if(A[j] == b){
                    C[j] = true;
                }
            }
        }

        for(int y=0;y<3;y++){
            for(int x=0;x<3;x++){
                if(!C[y*3+x]) break;
                if(x == 2){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(!C[y*3+x]) break;
                if(y == 2){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        if((C[0] && C[4]) && C[8]){
            System.out.println("Yes");
            return;
        }

        if((C[2] && C[4]) && C[6]){
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
