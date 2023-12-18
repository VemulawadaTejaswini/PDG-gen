public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    String s=buf.readLine();
    String[] x=s.split(" ");
    int a=Integer.parseInt(x[0]);
    int b=Integer.parseInt(x[1]);
    int c=Integer.parseInt(x[2]);
    int tmp;
    if(b<a){
        tmp=b;
        b=a;
        a=tmp;
    }
    if(c<b){
        tmp=c;
        c=b;
        b=tmp;
    }
    if(b<a){
        tmp=a;
        a=b;
        b=tmp;
    }
    System.out.println(a+" "+b+" "+c);
  }
}
