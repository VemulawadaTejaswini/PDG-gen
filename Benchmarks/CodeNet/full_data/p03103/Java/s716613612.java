import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[1000000000];
        for(int i=0;n>i;i++) {
        	array[i]=0;
        }
        for(int i=0;n>i;i++) {
        	long a = sc.nextLong();
        	int b = sc.nextInt();
        	array[(int) a] = b;
        }
        int loop=0;
        long money=0;
        long count=0;
        while(true) {
        	if(array[loop]!=0) {
        		while(true) {
        			if(array[loop]==0)
        				break;
        			if(count==m)
        				break;
        			money=money+loop;
        			count++;
        			array[loop]=array[loop]-1;
        		}
        	}
        	if(count==m)
        		break;
        	loop++;
        }
        System.out.println(money);
	}
}