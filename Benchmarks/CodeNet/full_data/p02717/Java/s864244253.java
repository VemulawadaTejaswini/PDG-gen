public class A_ABCSwap{

    public static void main(String[] args) {
        int X = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        int Z = Integer.parseInt(args[2]);

        A_ABCSwap abcSwap = new A_ABCSwap();

        int temp[] = abcSwap.swap(X,Y);
        X = temp[0]; Y = temp[1];

        temp = abcSwap.swap(X,Z);
        X = temp[0]; Z = temp[1];

        System.out.print(X + " " + Y + " " + Z);
    }
    
    public int[] swap(int a, int b){
        int newa = b;
        int newb = a;
        int ret[] = new int[2];
        ret[0]=newa; ret[1]=newb;
        return ret;
    }



}