class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String two_line = br.readLine();
    String[] line = two_line.split(" ");
    int length = Integer.parseInt(line[0]);
    int side = Integer.parseInt(line[1]);
    int area = length * side;
    int perimeter = length * 2 + side * 2;
    System.out.println(area + " " + perimeter);
  }
}
