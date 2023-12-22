import java.util.*;
import java.io.*;
class Main{
    public static int compute(StringBuilder[] sb,int h,int w,int r,int c,int count){
        if(r==h-1 && c==w-1){
            if(sb[r].charAt(c)=='#')
                count++;
            return count;
        }
        if(r>=h || c>=w)  return Integer.MAX_VALUE;
        if(sb[r].charAt(c)=='#')
            count++;
        int c1=compute(sb, h, w, r+1, c, count);
        int c2=compute(sb, h, w, r, c+1, count);
        return (c1<c2)?c1:c2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int h=sc.nextInt();
        int w=sc.nextInt();
        sc.nextLine();
        StringBuilder sb[]=new StringBuilder[h];
        for(int i=0;i<h;i++){
            sb[i]=new StringBuilder(sc.nextLine());
        }
        System.out.println(compute(sb,h,w,0,0,0));
    }
}