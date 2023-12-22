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
//		System.setIn(new FileInputStream("T02CityID22.txt"));
//		long ct1 = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int M=Integer.parseInt(st.nextToken().trim());
		Integer[][] cities = new Integer[M][4];
		for(int i=0;i<M;i++)
		{
			st = new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken().trim());
			int y=Integer.parseInt(st.nextToken().trim());
			cities[i][0]=i;
			cities[i][1]=p;
			cities[i][2]=p*1000000+y;
	    }
		Arrays.sort(cities,0,M,new Comparator<Integer[]>() {
            public int compare(Integer[] x, Integer[] y) {
                if(x[2] < y[2]){
                    return -1;
                } else if(x[2] > y[2]){
                    return 1;
                } else {
                    return 0;
                }
            }
		});

		int pchange=0,ychange=0;
		for(int i=0;i<M;i++)
		{
			int p= cities[i][1];
			int y= cities[i][2];
			if(pchange!=p)
			{
				pchange=p;
				ychange=1;
			}
			else
			{				
				ychange++;
			}
			cities[i][3]=pchange*1000000+ychange;
		}
		Arrays.sort(cities,0,M,new Comparator<Integer[]>() {
            public int compare(Integer[] x, Integer[] y) {
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
			int p= cities[i][1]/1000000;
			if(p<10)
			{
				System.out.println("00000" + cities[i][3]);
			}
			else if(p<100)
			{
				System.out.println("0000" + cities[i][3]);
			}
			else if(p<1000)
			{
				System.out.println("000" + cities[i][3]);
			}
			else if(p<10000)
			{
				System.out.println("00" + cities[i][3]);
			}
			else if(p<100000)
			{
				System.out.println("0" + cities[i][3]);
			}
			else
			{
				System.out.println(cities[i][3]);
			}			
		}
//		long ct2 = System.currentTimeMillis();
//		System.out.println(ct1 + "   " + ct2 + " " + (ct2-ct1));
	}
}
