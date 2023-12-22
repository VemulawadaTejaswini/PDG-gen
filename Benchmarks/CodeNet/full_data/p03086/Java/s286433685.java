import java.util.*;

class Main{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int ans = 0;
        int count = 0;
        for(int i = 0;i < str.length;i++){
            String s = str[i];
            if(s.equals("A") || s.equals("C") || s.equals("G") || s.equals("T")){
                count++;
            }else{
                if(ans < count){
                    ans = count;
                }
                count = 0;
            }
        }
        System.out.println(ans);
    }
}