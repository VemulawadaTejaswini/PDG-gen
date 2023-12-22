import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int j=0;
        while(j<n && s.charAt(j)!='#')
        {
            j++;
        }
        int x=0;
        for(int i=j;i<n;i++)
        {
            if(s.charAt(i)=='#' && i+1<n && s.charAt(i+1)=='.')
            {
                x++;
                i++;
            }
        }
        System.out.println(x);
    }
}
