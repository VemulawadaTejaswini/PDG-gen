import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        int K = input.nextInt();
        int S = input.nextInt();
        int X=0,Y=0,Z=0;
        int count = 0;

        for(int ix=0; ix<=K && X+Y+Z<=S; ix++){
            X = ix;
            for(int iy=0; iy<=K && X+Y+Z<=S; iy++){
                Y = iy;
                for(int iz=0; iz<=K && X+Y+Z<=S; iz++){
                    Z=iz;
                    if(X+Y+Z==S){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
	}
}