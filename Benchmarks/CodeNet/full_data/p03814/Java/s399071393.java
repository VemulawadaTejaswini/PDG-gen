import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] s = sc.next().split("");

        int a_pos=0;
        for(int i=0; i<s.length; i++){
            if(s[i].equals("A")){
                a_pos = i;
                break;
            }
        }
        
        int z_pos=0;
        for(int i=s.length-1; i>=0; i--){
            if(s[i].equals("Z")){
                z_pos = i;
                break;
            }
        }

        int ans = z_pos - a_pos;
        
        System.out.println(ans+1);
        
    }
}