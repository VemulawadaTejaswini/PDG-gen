public class Main {
    public static void main(String args[])throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = br.readLine();
                line = line.trim();
                String[] readLineArray = line.split("[\\s+]");
                int W,H,x,y,r;
                W = Integer.parseInt(readLineArray[0]);
                H = Integer.parseInt(readLineArray[1]);
                x = Integer.parseInt(readLineArray[2]);
                y = Integer.parseInt(readLineArray[3]);
                r = Integer.parseInt(readLineArray[4]);
                if( (x - r) >= 0 && (x + r) <= W && (y - r) >= 0 && (y + r) <= H ){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
    }
}
