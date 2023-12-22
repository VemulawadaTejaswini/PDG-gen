import java.util.Scanner;

public class Main {

	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] input = new int[m][2];

        for(int[] i:input){
        	i[0] = sc.nextInt();
        	i[1] = sc.nextInt();
        }

        //System.out.printf("%d\n",input[0][0]);

        boolean isPossible = false;

        for (int[] ary:input)
        {
        	if(ary[0] == 1){
        		for(int[] ary2:input)
        		{
        			if(ary[1] == ary2[0] && ary2[1] == n)
        			{
        				isPossible = true;
        			}
        		}
        	}

        }


        if(isPossible)System.out.printf("POSSIBLE");
        else System.out.printf("IMPOSSIBLE");

    }

}