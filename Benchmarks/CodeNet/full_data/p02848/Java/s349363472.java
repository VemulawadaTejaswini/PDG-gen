
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        //int n = Integer.parseInt(scanner.nextLine());
        //String d = scanner.nextLine();
       
        int n    =  Integer.parseInt(scanner.nextLine());
        String s =  scanner.nextLine();
        
        char[] ss = s.toCharArray();
        
        for(int i = 0 ; i < ss.length ; i++){
            ss[i] = inc(ss[i],n);
        }
        
        System.out.println(new String(ss));
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
    
    private static char inc(char c, int n){
        
        char ret = c;
        for(int i = 0 ; i < n ; i ++){
            if(ret == 'z'){
                ret = 'a';
            }
            else if(ret == 'Z'){
                ret = 'A';
            }
            else{
                ret++;
            }
        }
        return ret;
        
    }
}