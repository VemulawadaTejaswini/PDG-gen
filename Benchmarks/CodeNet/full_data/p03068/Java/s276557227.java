import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.next();
        int k=sc.nextInt();
        String S=s.substring(k-1,k);
        String ans="";
        for(int i=0;i<s.length();i++) {
        	if(s.substring(i,i+1).equals(S))ans+=S;
        	else ans+="*";
        }
        System.out.println(ans);
    }
}
