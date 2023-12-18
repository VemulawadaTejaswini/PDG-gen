class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str_Three_Number = br.readLine().split(" ");
    int[] three_Number = new int[3];
    for(int i = 0; i < 3; i++){
      three_Number[i] = Integer.parseInt(str_Three_Number[i]);
    }
    for(int i = 0; i <= three_Number.length - 1; i++){
      for(int j = three_Number.length - 1; j > 0 ; j-- ){
        if(three_Number[j-1] > three_Number[j]){
          int tmp = three_Number[j];
          three_Number[j] = three_Number[j - 1];
          three_Number[j - 1] = tmp;
        }
      }
    }
    System.out.println(three_Number[0] + " " + three_Number[1] + " " + three_Number[2]);
  }
}
