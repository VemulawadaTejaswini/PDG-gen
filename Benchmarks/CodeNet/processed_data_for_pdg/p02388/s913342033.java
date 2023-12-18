class Main {
   public static void main(String[] args){
     try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String buf = br.readLine();
     int x = Integer.parseInt(buf);
     System.out.println(x * x * x);}
     catch(Exception e){}
  }
}
