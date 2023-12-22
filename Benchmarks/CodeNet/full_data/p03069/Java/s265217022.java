import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       String s=sc.next();
       int ans=0;
       int black=0;
       int white=0;
       for(int i=0;i<s.length();i++) {
    	   if(s.substring(i,i+1).equals("#")) {
    		   if(white>0) {
    			   ans+=white;
    			   white=0;
    			   black=0;
    		   }
    		   black++;
    	   }else if(s.substring(i,i+1).equals(".")){
    		   if(black>0&&white<black)white++;
    	   }
       }
       if(white>0)ans+=white;
       System.out.println(ans);
    }
}
