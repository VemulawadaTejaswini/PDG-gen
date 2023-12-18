public class Main{
public static void main(String[] args){
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try{
String line = reader.readLine();
    int x = Integer.parseInt(line);
    int result = 1;
    for(int i=0; i<3; i++){
        result *= x;
    }
     System.out.println(result);
} catch(IOException e){
System.out.println(e);
     }
}
}
