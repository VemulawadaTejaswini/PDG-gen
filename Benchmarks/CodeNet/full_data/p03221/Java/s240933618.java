import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] valAry = new int[M][4];//区域  年份  case顺序  排序顺序
		
		for(int i = 0; i < M ; i++){
			int P = sc.nextInt();
			int Y = sc.nextInt();
			valAry[i][0] = P;
			valAry[i][1] = Y;
			valAry[i][2] = i;
		}
		
		sortIntArray(valAry, new int[] { 0, 1 });

		for (int i = 0; i < valAry.length - 1; i++){
			int j = i + 1;
			if (valAry[i][0] == valAry[j][0]) valAry[j][3] = valAry[j][3] + 1;
		}
		
		sortIntArray(valAry, new int[] {2});
		for(int i = 0; i < M ; i++){
			System.out.println(String.format("%06d", valAry[i][0])+String.format("%06d", valAry[i][3] + 1));
		}
	}
	
	public static void sortIntArray(int[][] arObjects, final int[] arOrders)
    {
        Arrays.sort(arObjects, new Comparator<Object>()
        {
            public int compare(Object oObjectA, Object oObjectB)
            {
                int[] arTempOne = (int[])oObjectA;
                int[] arTempTwo = (int[])oObjectB;
                for (int i = 0; i < arOrders.length; i++)
                {
                    int k = arOrders[i];
                    if (arTempOne[k] > arTempTwo[k]) return 1;
                    else if (arTempOne[k] < arTempTwo[k]) return -1;
                    else continue;
                }
                return 0;
            }
        });
    }
}