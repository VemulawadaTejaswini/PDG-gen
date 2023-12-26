public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String line = br.readLine();
        String aInput[] = null;
        aInput = line.split(" ");
        String aDate = null;
        System.out.println(aInput[0].replaceAll("2017", "2018"));
    }
}
