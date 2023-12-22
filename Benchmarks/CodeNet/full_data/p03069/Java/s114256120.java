import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       String s=sc.next();
       int ans=0;
       for(int i=0;i<s.length()-1;i++) {
    	   if(s.substring(i,i+1).equals("#")&&s.substring(i+1,i+2).equals(".")) {
    		   ans++;
    	   }
       }
       System.out.println(ans);
    }
}
