    import java.util.Scanner;
     
    class Main{
     
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            String T = "";
            String[] str = {"dream","dreamer","erase","eraser"};
     
            
            S = S.replace("eraser", "").replace("erase", "").replace("dreamer", "").replace("dream", "");
     
            if( S.equals("")){
                System.out.println("YES"); 
            }else{
                System.out.println("NO");
            }
            
        }
    }