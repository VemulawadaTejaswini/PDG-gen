    import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {

    	public static void main(String[] args) throws IOException {
    		Scanner sc = new Scanner(System.in);
    		//int n = sc.nextInt();
    		//String[] array = new String[h+1];
    		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
    		List<Integer> list=new ArrayList<Integer>();
    		int n = sc.nextInt();
    		int d = sc.nextInt();

    		for(int i=0;n>i;i++) {
    			for(int j=0;d>j;j++) {
    				int x = sc.nextInt();
    				list.add(x);
    			}
    		}
    		int count=0;
    		//System.out.println(list);

    		for(int i=0;n*d>i;i=i+d) {
    			//System.out.println(i);
    			for(int j=i;n*d-d>j;j=j+d) {
    				//System.out.println(j);
    				int dis =0;
    				for(int ii=0;d>ii;ii++) {
    					//System.out.println(ii);
    					dis = (int) (dis+Math.pow((list.get(i+ii)
    							-list.get(j+i+ii)),2));
    				}
    				//System.out.println(dis);
    				if(Math.sqrt(dis)==(int)Math.sqrt(dis)) {
    					count++;
    				}

    			}
    		}
    		System.out.println(count);
    	}
    }