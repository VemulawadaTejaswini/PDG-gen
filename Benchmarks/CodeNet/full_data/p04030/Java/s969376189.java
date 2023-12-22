    import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    String sS;
    	Scanner scan = new Scanner(System.in);
    sS=scan.nextLine();
    
    char[] cS = sS.toCharArray();
    
    for(int i=0;i<sS.length();i++){
    	if(cS[i]=='B' && i!=0)cS[i-1]='a';
    }
    for(int i=0;i<sS.length();i++){
    	if(cS[i]!='a' && cS[i]!='B')System.out.print(cS[i]);
    }
    }
}