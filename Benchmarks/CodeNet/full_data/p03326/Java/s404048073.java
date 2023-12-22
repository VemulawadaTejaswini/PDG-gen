import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Long[]> li = new ArrayList<Long[]>();
        for(int i = 0; i < 8; i++){
            li.add(new Long[n]);
        }
        /*
        Long[] ppp = new Long[n];
        Long[] ppm = new Long[n];
        Long[] pmp = new Long[n];
        Long[] pmm = new Long[n];
        Long[] mpp = new Long[n];
        Long[] mmp = new Long[n];
        Long[] mpm = new Long[n];
        Long[] mmm = new Long[n];
        */
        for(int i = 0; i < n; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            li.get(0)[i] = a+b+c;
            li.get(1)[i] = a+b-c;
            li.get(2)[i] = a-b+c;
            li.get(3)[i] = a-b-c;
            li.get(4)[i] = -a+b+c;
            li.get(5)[i] = -a-b+c;
            li.get(6)[i] = -a+b-c;
            li.get(7)[i] = -a-b-c;
            
            /*
            ppp[i] = Math.abs(a+b+c);
            ppm[i] = Math.abs(a+b-c);
            pmp[i] = Math.abs(a-b+c);
            pmm[i] = Math.abs(a-b-c);
            mpp[i] = Math.abs(-a+b+c);
            mmp[i] = Math.abs(-a-b+c);
            mpm[i] = Math.abs(-a+b-c);
            mmm[i] = Math.abs(-a-b-c);
            */
        }
        Arrays.sort(li.get(0),Comparator.reverseOrder());
        Arrays.sort(li.get(1),Comparator.reverseOrder());
        Arrays.sort(li.get(2),Comparator.reverseOrder());
        Arrays.sort(li.get(3),Comparator.reverseOrder());
        Arrays.sort(li.get(4),Comparator.reverseOrder());
        Arrays.sort(li.get(5),Comparator.reverseOrder());
        Arrays.sort(li.get(6),Comparator.reverseOrder());
        Arrays.sort(li.get(7),Comparator.reverseOrder());
        /*
        Arrays.sort(ppp,Comparator.reverseOrder());
        Arrays.sort(ppm,Comparator.reverseOrder());
        Arrays.sort(pmp,Comparator.reverseOrder());
        Arrays.sort(pmm,Comparator.reverseOrder());
        Arrays.sort(mpp,Comparator.reverseOrder());
        Arrays.sort(mmp,Comparator.reverseOrder());
        Arrays.sort(mpm,Comparator.reverseOrder());
        Arrays.sort(mmm,Comparator.reverseOrder());
        */
        long ans = -Long.MAX_VALUE;
        for(int i = 0; i < 8; i++){
            long tmp = 0;
            for(int j = 0; j < m; j++){
                tmp += li.get(i)[j];
            }
            ans = Math.max(ans,tmp);
        }
        /*
        ans = Math.max(ans,ppp[0] + ppp[1] + ppp[2]);
        ans = Math.max(ans,ppm[0] + ppm[1] + ppm[2]);
        ans = Math.max(ans,pmp[0] + pmp[1] + pmp[2]);
        ans = Math.max(ans,pmm[0] + pmm[1] + pmm[2]);
        ans = Math.max(ans,mpp[0] + mpp[1] + mpp[2]);
        ans = Math.max(ans,mmp[0] + mmp[1] + mmp[2]);
        ans = Math.max(ans,mpm[0] + mpm[1] + mpm[2]);
        ans = Math.max(ans,mmm[0] + mmm[1] + mmm[2]);
        */
        System.out.println(ans);
    }
}