public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = null;
        String input2 = null;
        try {
            input1 = br.readLine();
            input2 = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int n = Integer.parseInt(input1.split(" ")[0]);   int x = Integer.parseInt(input1.split(" ")[1]);
        List<Integer> boundDistance = new ArrayList();
        for(String s : input2.split(" ")){
            boundDistance.add(Integer.parseInt(s));
        }
        int boundPoint, countUnderX;
        boundPoint = 0;
        countUnderX = 0;
        for(int i = 0; i <= n; i++){
            if(boundPoint <= x) countUnderX++;
            if(i != n) boundPoint += boundDistance.get(i);
        }
        System.out.println(countUnderX);
    }
}
