import java.util.Scanner;

public class Main {
    static int n ;
    static long x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        x = Long.parseLong(sc.next());
        System.out.println(dfs(x,n));
        sc.close();
    }

    public static long dfs(long remain,int level){
        if(level == 0){
            return 1;
        }else{
            if(remain==1){
                return 0;
            }else if(remain <=((1L<<(level+1))-2)){
                return dfs(remain-1,level-1);
            }else if(remain ==((1L<<(level+1))-1)){
                return 1L<<level;
            }else if(remain ==(1L<<(level+2))-3){
                return (1L<<(level+1))-1;
            }else {
                return (1L<<level) + dfs(remain-(1L<<(level+1))+1,level-1);
            }
        }
    }
}