import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String keyence = "keyence";
        int cnt = 0;
        boolean flag = false;
        boolean flag1 = false;
        if(s.length() < 7){
            System.out.println("NO");
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==keyence.charAt(cnt)){
                cnt++; flag = false;
            }
            else if(s.charAt(i)!=keyence.charAt(cnt)&&!flag){
                if(flag1){
                    System.out.println("NO");
                    break;
                }
                flag = true; flag1 = true;
            }
            if(cnt==7 && i!=s.length()-1){
                if(!flag1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                break;
            }
            else if(cnt==7 && i==s.length()-1){
                System.out.println("YES");
                break;
            }
        }
        if(cnt==0)
            System.out.println("NO");
    }
}