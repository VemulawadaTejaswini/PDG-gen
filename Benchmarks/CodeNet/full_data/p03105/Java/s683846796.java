
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        String []n=name.split(" ");
      	int a=Integer.parseInt(n[0]);
      	int b=Integer.parseInt(n[1]);
      	int c=Integer.parseInt(n[2]);
      	int count=0;
      	if(a=<b){
      	for(int i=0;i<c;i++){
        	if(a=<b){
            b=b-a;
              count++;
            }
        }
          System.out.println(count);
       }
      else{
      System.out.println("0");
      }
    }
       }