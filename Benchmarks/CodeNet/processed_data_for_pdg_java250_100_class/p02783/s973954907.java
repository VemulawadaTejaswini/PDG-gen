public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int h = Integer.parseInt(str[0]);
    int a = Integer.parseInt(str[1]);
    int num = 0;    
    for(int i = 1; h>0; i++){
      h=h-a;
      num++;
    }
    System.out.println(num);
  }
}
