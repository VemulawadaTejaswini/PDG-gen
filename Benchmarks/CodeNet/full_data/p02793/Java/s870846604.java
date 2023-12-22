import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i < a; i++) {
			list.add(sc.nextInt());
		}
		int max = getLcm(list);
		int ans = 0;
		for (int i=0; i < list.size(); i++) {
			ans += (max / list.get(i));
		}
		int mod = (int)Math.pow(10, 9) + 7;      
		System.out.println(ans % mod);
	}
	public static int getLcm(ArrayList<Integer> list){
        int valueLCM = 0;

        for(int index=0; index<list.size()-1; index++) {
            if( index==0 ) {
                valueLCM = calcLCM( list.get(index), list.get(index+1) );
            } else {
                valueLCM = calcLCM( valueLCM,        list.get(index+1) );
            }
        }
        return valueLCM;
    }

    private static int calcLCM(int val1, int val2) {
        int maxValue = Math.max(val1, val2);
        int minValue = Math.min(val1, val2);
        long val3    = maxValue * minValue;

        if(minValue==0) return maxValue;

        int temp;
        while( (temp=maxValue%minValue)!=0 ) {
            maxValue=minValue;
            minValue=temp;
        }

        return (int)(val3/minValue);
    }
}


