public class Main
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int ans=0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='+'){
                ans++;
            }else{
                ans--;
            }
        }
        System.out.println(ans);
    }
}
