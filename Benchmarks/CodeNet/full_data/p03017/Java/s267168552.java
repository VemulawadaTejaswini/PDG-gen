import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        int C = sc.nextInt()-1;
        int D = sc.nextInt()-1;
        String[] str = sc.next().split("");
        int[] map = new int[N];
        for(int i=0;i<N;i++){
            if(str[i].equals("#")){
                map[i] = 1;
            }
        }

        boolean AisGoal = false;
        boolean BisGoal = false;
        map[B] = 1;
        if(C < D){
            while(true){
                if(judge(map, A, B-1) && !AisGoal){
                    A=B-1;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, A, B-2) && !AisGoal){
                    A=B-2;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, B, B+1) && !BisGoal){
                    map[B] = 0;
                    B +=1;
                    map[B] = 1;
                    if(B==D)BisGoal=true;
                }
                else if(judge(map, B, B+2) && !BisGoal){
                    map[B] = 0;
                    B +=2;
                    map[B] = 1;
                    if(B==D)BisGoal=true;
                }
                else{
                    if(AisGoal && BisGoal){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                    return;
                }
            }
        }
        else{
            while(true){
                if(judge(map, A, B+1) && !AisGoal){
                    map[A]=0;
                    A=B+1;
                    map[A]=1;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, A, B-1) && !AisGoal){
                    map[A]=0;
                    A=B-1;
                    map[A]=1;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, A, B-2) && !AisGoal){
                    map[A]=0;
                    A=B-2;
                    map[A]=1;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, A, A+1) && !AisGoal){
                    map[A]=0;
                    A++;
                    map[A]=1;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, A, A+2) && !AisGoal){
                    map[A]=0;
                    A+=2;
                    map[A]=1;
                    if(A==C)AisGoal=true;
                }
                else if(judge(map, B, B+1) && !BisGoal){
                    map[B] = 0;
                    B +=1;
                    map[B] = 1;
                    if(B==D)BisGoal=true;
                }
                else if(judge(map, B, B+2) && !BisGoal){
                    map[B] = 0;
                    B +=2;
                    map[B] = 1;
                    if(B==D)BisGoal=true;
                }
                else{
                    if(AisGoal && BisGoal){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                    return;
                }
            }
        }
    }


    public static boolean judge(int[] map, int pos, int gol) {
        if(pos > gol)return false;
        for(int i=pos+1;i<map.length;i++){
            if(map[i]==1){
                if(i+1>=map.length)return false;
                if(map[i+1]==1){
                    return false;
                }
                else{
                    i++;
                    if(i==gol){
                        return true;
                    }
                }
            }
            else{
                if(i==gol){
                    return true;
                }
            }
        }
        return false;
    }

    public static void dump(int[] a) {
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}

