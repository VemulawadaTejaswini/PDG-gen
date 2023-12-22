
import java.util.*;
public class Main implements Runnable{

    private static int n;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)throws Exception{

        new Thread(null,new Main(),"",16 * 1024 * 1024).start();
    }

    public void run(){
        n = sc.nextInt();
        System.out.println(dfs(0,false));
    }

    static int dfs(int num,boolean flag){//深さ優先探索
        if(num > n)return 0;
        String s = String.valueOf(num);
        int count = 0;

        if(!flag){
            if(s.contains("3") && s.contains("5") && s.contains("7")){
                count++;
                flag = true;
            }
        }else{
            count ++;
        }
        return count + dfs(10 * num + 3,flag) + dfs(10 * num + 5,flag) + dfs(10 * num + 7,flag);
    }
}
