    import java.util.Scanner;
    import java.util.Arrays;
     
    public class Main
    {
     
    	public static void main(String[] args)
    	{	Scanner s = new Scanner(System.in);
                    String a = s.next();
                    long n = s.nextLong();
              //    int d = s.nextInt();
                    long i=0,j=0,ans=0;
                    if(a.charAt(0)!='1'){
                           ans = a.charAt(0);
                    }else{
                       for(i=0;i<a.length();i++){
                            if(a.charAt(i)=='1' && j==i-1){
                               j++;
                            }else{
                               if(n<=j){
                                    ans= a.charAt(0);
                               }else{
                                    ans= a.charAt(i);
                               }
                            }
                       }
                    }
                    System.out.println(ans);
    	}
    }