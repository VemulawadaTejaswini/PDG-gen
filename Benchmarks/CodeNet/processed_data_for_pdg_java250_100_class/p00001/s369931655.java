public class Main {
  public static void main(String args[] ) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int[] list = new int [10];
     for (int i = 0; i < 10; i++) {
       String s = br.readLine();
       int n = Integer.parseInt(s);
       list[i] = n;
     }
     Arrays.sort(list);
     System.out.println(list[list.length-1]);
     System.out.println(list[list.length-2]);
     System.out.println(list[list.length-3]);
     br.close();
  }
}
