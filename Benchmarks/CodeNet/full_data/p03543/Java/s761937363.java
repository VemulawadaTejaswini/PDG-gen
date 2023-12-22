import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String n=scn.next();
        scn.close();
        int cnt=0;
        String answer="No";
        for(int i=0;i<n.length();i++){
            for(int j=0;j<n.length();j++){
                if(i==j) continue;
                if(n.charAt(i)==n.charAt(j)) cnt++;
            }
            if(cnt>=3){
                answer="Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}