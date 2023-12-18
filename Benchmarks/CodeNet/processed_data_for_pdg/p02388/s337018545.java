public class Main{
  public static void main(String[]args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
    String line = reader.readLine();
    int fi = Integer.parseInt(line);
    System.out.println(fi*fi*fi);
  }catch(IOException e){
    System.out.println(e);
  }catch(NumberFormatException e){
    System.out.println("数字が正しくありません");
  }
  }
}
