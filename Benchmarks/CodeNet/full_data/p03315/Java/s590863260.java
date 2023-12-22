import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        String x = scn.next();
        int answer = 0;
        for(int i=0;i<x.length();i++){
            char buf = x.charAt(i);
            if(buf=='+'){
                answer++;
            }else{
                answer--;
            }
        }
        System.out.println(answer);
    }
}
