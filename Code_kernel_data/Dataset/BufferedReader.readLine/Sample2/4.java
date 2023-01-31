//3
public class func{
	public void main(String args[]){
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        List<String> s1 = Arrays.asList( in.readLine().trim().split("\\s+") );
        List<String> s2 = Arrays.asList( in.readLine().trim().split("\\s+") );
        int big1 = Integer.parseInt(in.readLine().trim());
        int big2 = Integer.parseInt(in.readLine().trim());
        System.out.println(jaccard(s1,s2));
        System.out.println(sampleCorrectedJaccard(s1,s2, big1,big2));
}
}
