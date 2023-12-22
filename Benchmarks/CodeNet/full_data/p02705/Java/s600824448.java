public class Main {
2.    public static void main(String[] args) {
3.        int value = Integer.parseInt(readLine(255));
4.        System.out.printf("%f",(2*Math.PI*value));
5.    }
6. 
7.    public static  String readLine(int maxLen){
8.        int[] holder = new int[maxLen];
9.        int counter =0, reader =1;
10. 
11.        try{
12.            while(counter < maxLen){
13.                reader = System.in.read();
14.                if(reader <0 || (reader =='\n'))break;
15.                holder[counter++] = reader;
16.            }
17.        }catch(Exception ex){
18.            return (null);
19.        }
20. 
21.        if(counter ==0 && reader <0)return (null);
22.        return new String(holder,0,counter);
23.    }
24.}
