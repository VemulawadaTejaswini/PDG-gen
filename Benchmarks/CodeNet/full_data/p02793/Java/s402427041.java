import java.util.*;
public class Main {
  	private static long MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
      	long aaa[] = new long[a];
        ArrayList<Long> list = new ArrayList<Long>();
		for (int i=0; i < a; i++) {
			list.add(sc.nextLong());
		}
		long max = getLcm(list);
		long ans = 0;
		for (int i=0; i < list.size(); i++) {
			ans += (max / list.get(i)) % MOD;
		}
		System.out.println(ans% MOD);

	}
	public static long getLcm(ArrayList<Long> list){
        long valueLCM = 0;

        for(int index=0; index<list.size()-1; index++) {
            if( index==0 ) {
                valueLCM = calcLCM( list.get(index), list.get(index+1) );
            } else {
                valueLCM = calcLCM( valueLCM,        list.get(index+1) );
            }
        }
        return valueLCM;
    }

    private static long calcLCM(long val1, long val2) {
        long maxValue = Math.max(val1, val2);
        long minValue = Math.min(val1, val2);
        long val3    = maxValue * minValue;

        if(minValue==0) return maxValue;

        long temp;
        while( (temp=maxValue%minValue)!=0 ) {
            maxValue=minValue;
            minValue=temp;
        }

        return (long)(val3/minValue) ;
    }
}



