public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int a;
        int[] x;
        int i,j;
        x = new int[10000];
        try{
        i=1;
        while(true){
        line = reader.readLine();
        a = Integer.parseInt(line);
        if(a == 0) break;
        x[i-1]=a;
        ++i;
        }
        for(j=0;j<i-1;j++){
        System.out.println("Case "+(j+1)+": "+x[j]);
        }
        }catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
