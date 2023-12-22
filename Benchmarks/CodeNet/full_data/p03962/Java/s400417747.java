import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] iro = br.readLine().split(" ");
        Arrays.sort(iro);
        int sum=1;
        int k =0;
        int i=0;

for(int j=1; j<iro.length-i; j++){
		if(iro[i].equals(iro[i+j])){
			k = k+1;
		}
		else{
			sum=sum+1;
			i=j;
		}

}
System.out.println(sum);



    }
}
