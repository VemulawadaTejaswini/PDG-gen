import java.util.*;
public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] code = new String[n];
    boolean flg = false;
    String ans = "Yes";
    for(int i=0;i<n;i++){
        code[i] = sc.nextLine();
        if(i != 0 && !code[i].substring(0, 1).equals(code[i-1].substring(code[i-1].length() - 1, code[i-1].length()))){
            ans = "No";
            break;
        }
        for(int j=0;j<i;j++){
            if(code[i].equals(code[j])){
              ans = "No";
                flg = true;
                break;
            }
        }
        if(flg){
            break;
        }
    }
    System.out.println(ans);
	}
}