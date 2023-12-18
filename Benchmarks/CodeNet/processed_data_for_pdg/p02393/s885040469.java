public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            line = reader.readLine();
            String[] data = line.split(" ",3);
            int a = 0, b = 0, c = 0;
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            c = Integer.parseInt(data[2]);
            int max = 0, mid = 0, min = 0;
            if(a <= b && a <= c){
                min = a;
                if(b <= c){
                    mid = b;
                    max = c;
                }else{
                    mid = c;
                    max = b;
                }
            }else if(b <= a && b <= c){
                min = b;
                if(a <= c){
                    mid = a;
                    max = c;
                }else{
                    mid = c;
                    max = a;
                }
            }else if(c <= a && c <= b){
                min = c;
                if(a <= b){
                    mid = a;
                    max = b;
                }else{
                    mid = b;
                    max = a;
                }
            }
            System.out.println(min + " " + mid + " " + max);
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
