class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int i = 1;
    while(true){
      int data = Integer.parseInt(br.readLine());
      if(data == 0)
    	  break;
      sb.append("Case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(data)).append("\n");
    }
    System.out.print(sb);
  }
}
