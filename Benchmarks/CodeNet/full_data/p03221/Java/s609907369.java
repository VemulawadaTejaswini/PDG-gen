import java.io.*;
import java.util.*;
/**
 * @author Rick
 *
 */

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//		System.setIn(new FileInputStream("TestCase.txt"));
//		long ct1 = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int M=Integer.parseInt(st.nextToken().trim());
		int [][] cities = new int[M][4];
		for(int i=0;i<M;i++)
		{
			st = new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken().trim());
			int y=Integer.parseInt(st.nextToken().trim());
			cities[i][0]=i;
			cities[i][1]=p;
			cities[i][2]=y;
	    }
		Arrays.sort(cities,0,M,new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if(x[1] < y[1]){
                    return -1;
                } else if(x[1] > y[1]){
                    return 1;
                } else {
                	if(x[2] < y[2])
                		return -1;
                	else if(x[2] > y[2])
                		return 1;
                	else
                		return 0;
                }
            }
		});

		int pchange=0,ychange=0;
		for(int i=0;i<M;i++)
		{
			int p= cities[i][1];
			if(pchange!=p)
			{
				pchange=p;
				ychange=1;
			}
			else
			{				
				ychange++;
			}
			cities[i][3]=ychange;
		}
		Arrays.sort(cities,0,M,new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if(x[0] < y[0]){
                    return -1;
                } else if(x[0] > y[0]){
                    return 1;
                } else {
                    return 0;
                }
            }
		});	
		for(int i=0;i<M;i++)
		{
			System.out.println(SixDigital(cities[i][1])+SixDigital(cities[i][3]));
		}
//		long ct2 = System.currentTimeMillis();
//		System.out.println(ct1 + "   " + ct2 + " " + (ct2-ct1));
	}

	private static String SixDigital(int p) {
		if(p<10)
		{
			return "00000" + p;
		}
		else if(p<100)
		{
			return "0000" + p;
		}
		else if(p<1000)
		{
			return "000" + p;
		}
		else if(p<10000)
		{
			return "00" + p;
		}
		else if(p<100000)
		{
			return "0" + p;
		}
		else
		{
			return String.valueOf(p);
		}			
	}
}
