import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
        	String[] line = br.readLine().split(" ");
        	int machine = Integer.parseInt(line[0]) - 1;
        	int firstCookie = Integer.parseInt(line[1]);
        	// one of the best way is to continue making 127-yum cookie?
        	if(machine%2==0) System.out.println(firstCookie + 127*machine);
        	else System.out.println((127-firstCookie) + 127*machine);
        }
    }
}