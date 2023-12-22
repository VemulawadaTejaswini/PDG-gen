import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        String[] t = sc.nextLine().split("");
        Arrays.sort(s);
        Arrays.sort(t);
        int flag = 0;
        for(int i = 0;i<s.length;i++){
            if(!s[i].equals(t[i])){
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}