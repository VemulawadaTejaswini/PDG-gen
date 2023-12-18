class Main{
public static void main(String [] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x;
int result;
x=Integer.parseInt(br.readLine());
result = x*x*x;
System.out.println(result);
}
}
