import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String s = sc.nextLine();
        int len = s.length();
        boolean easyP = false;
        for(int i = 0;i<len-1;i+=2){
            if(s.charAt(i)=='R'||s.charAt(i)=='U'||s.charAt(i)=='D'){
                if(s.charAt(i+1)=='L'||s.charAt(i+1)=='U'||s.charAt(i+1)=='D'){
                    easyP = true;
                    continue;
                }
                else{
                    easyP = false;
                }
            }
            else{
                easyP = false;
            }

        }
        System.out.println(easyP?"Yes":"No");
    }
}