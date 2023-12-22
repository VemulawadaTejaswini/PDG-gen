import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) System.out.println("Yes");
        else System.out.println("No");
    }
    
    public static boolean check(int n){
        String[] narray = String.valueOf(n).split("");
        int len = narray.length;
        int count = 0;
        int bool = 0;
        for (int i=0;i<len-3;i++){
            for (int j=i;j<i+3;j++){
                if (narray[i].equals(narray[j])) count++;
            }
            if(count==3) {
                bool = 1;
                break;
            }
count=0;
        }
        if(bool==0){
            return false;
        }else{
            return true;
        }
    }
}