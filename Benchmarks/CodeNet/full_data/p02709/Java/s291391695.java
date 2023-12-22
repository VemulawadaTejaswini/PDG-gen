import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
	static public Integer [] ans = new Integer[2000];
	static public int aIdx = 0;

	static public class A
	{
		public Integer active;
		public Integer index;

		public A(int a,  int i) {
			active = new Integer(a);
			index = new Integer(i);
		}
	}


	public static void main(String[] args)
	{
		Arrays.fill(ans, 0, 2000, 0);
		List<Main.A> list = new ArrayList<Main.A>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] b = new int[n];
		for (int i=0; i<n; i++) {
			list.add(new Main.A(sc.nextInt(), i));
		}
		sc.close();

		// listをactiveで降順ソート
        Collections.sort(
            list,
            new Comparator<Main.A>() {
                @Override
                public int compare(Main.A obj1, Main.A obj2) {
                    return obj2.active - obj1.active;
                }
            }
        );

		int index=0;
    	int min=0;
    	int max=n-1;
        Main.A[] array = list.toArray(new Main.A[list.size()]);
        calc(array, min, max, index, 0);

        Arrays.sort(ans,  Collections.reverseOrder());

		System.out.println(ans[0]);
	}

	/*
	 * mapKey:活発度の配列（降順）
	 * min:現時点で取りうる最小の添字
	 * max:現時点で取りうる最大の添字
	 * index:for文を開始する添字
	 * mMap:map
	 * ansIdx:ans配列の添字
	 */
	private static void calc(Main.A[] array, int min, int max, int index, int ansIdx)
	{
		//if (index == mapKey.length-1) return;
    	for (int i=index; i<array.length; i++) {
            //System.out.println(mapKey[i]+":"+mMap.get(mapKey[i]));
    		Integer orgIndex = array[i].index;
    		int maxs= Math.abs(max-orgIndex);
    		int mins = Math.abs(orgIndex-min);
            if ( maxs == mins) {
            	if (i ==0 || max==min) {
            		ans[ansIdx]+=(Integer)array[i].active*maxs;
            		max-=1;
            	} else {
            		calc(array, min+1, max, i+1, ansIdx);
            		aIdx+=1;
            		calc(array, min, max-1, i+1, aIdx);
            	}
            } else if (maxs > mins) {
        		ans[ansIdx]+=(Integer)array[i].active*maxs;
            	max-=1;
            } else {
        		ans[ansIdx]+=(Integer)array[i].active*mins;
            	min+=1;
            }
    	}
	}

}
