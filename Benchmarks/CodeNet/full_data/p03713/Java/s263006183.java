import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        long ans;
        if(w%3==0||h%3==0) ans = 0;
        else{
            ans = Math.min(helper(h,w),helper(w,h));
        }
        System.out.println(ans);
    }
    static long helper(int height, int width){
        long h = (long) height;
        long w = (long) width;
        long len1 = w/3+w%3-1;
        long s1=h*len1;
        long s2=h*((w-len1)/2);
        long s3=h*w-s2-s1;
        long s4=(w-len1)*(h/2);
        long s5=h*w-s4-s1;
        long ans1 = Math.max(s1,Math.max(s2,s3))-Math.min(s1,Math.min(s2,s3));
        long ans2 = Math.max(s1,Math.max(s4,s5))-Math.min(s1,Math.min(s4,s5));
        return Math.min(ans1,ans2);
    }
}
