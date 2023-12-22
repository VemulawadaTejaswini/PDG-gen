import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=0;

        if(s.length()<2){
            System.out.println("No");
        }
        else{
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='h'&&s.charAt(i+1)=='i'){
                    ans++;
                    break;
                }
            }
            if(ans>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }        
        sc.close();
    }
}