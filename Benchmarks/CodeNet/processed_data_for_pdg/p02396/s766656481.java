class Main{
 public static void main(String[] args)throws IOException{
  int x;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int i = 1; 
  while(true){
    x = Integer.parseInt(br.readLine());  
    if(x==0) break;   
    System.out.println("Case "+ i +": "+ x); 
    i++;
  }
 }
}
