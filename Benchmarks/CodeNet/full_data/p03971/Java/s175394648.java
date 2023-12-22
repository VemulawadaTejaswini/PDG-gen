import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //人数
        int n = sc.nextInt();
        //基本人数
        int a = sc.nextInt();
        //海外勢の順位
        int b = sc.nextInt();
        sc.nextLine();
        
        //確定者
        int pass = 0;
        
        //海外勢の内の順位
        int rank = 1;
        
        String str = sc.nextLine();
        for(int i = 0;i < n;i++){
            //１位からの属性
            char c = str.charAt(i);
            //国内学生の場合
            if(c == 'a'){
                if(pass < a + b){
                    System.out.println("Yes");
                    pass++;
                }else{
                    System.out.println("No");
                }
            }
            
            //海外勢の場合
            if(c == 'b'){
                if(pass < a + b && rank <= b){
                    System.out.println("Yes");
                    pass++;
                    rank++;
                }else{
                    System.out.println("No");
                }
            }
            
            //それ以外の場合
            if(c == 'c'){
                System.out.println("No");
            }
        }
    }
}
