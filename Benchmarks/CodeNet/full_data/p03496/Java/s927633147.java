import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int iin = sc.nextInt();
        int[] iia = new int[iin];
        String[] sirta = new String[100];
        int idxsirta = 0;
        int imax = -1000001;
        int imaxidx = 0;
        int imin = 1000001;
        int iminidx = 0;
        for(int i=0;i<iin;i++){
          iia[i] = sc.nextInt();
          if(imax < iia[i]){
            imax = iia[i];
            imaxidx = i+1;
          }
          if(imin > iia[i]){
            imin = iia[i];
            iminidx = i+1;
          }
        }
        if(imin>=0){
          for(int i=0;i<iin-1;i++){
            if(iia[i]>iia[i+1]){
              iia[i+1] += iia[i];
              sirta[idxsirta] = (i+1) + " " + (i+2);
              idxsirta++;
            }
          }
        }
        else if(imax<0){
          for(int i=iin-1;i>0;i--){
            if(iia[i-1]>iia[i]){
              iia[i-1] += iia[i];
              sirta[idxsirta] = (i+1) + " " + i;
              idxsirta++;
            }
          }          
        }
        else{
          if(imax-(imin*(-1))>=0){
            for(int i=0;i<iin;i++){
              if(iia[i]<0){
                iia[i] += imax;
                sirta[idxsirta] = imaxidx + " " + (i+1);
                idxsirta++;
              }
            }
            for(int i=0;i<iin-1;i++){
              if(iia[i]>iia[i+1]){
                iia[i+1] += iia[i];
                sirta[idxsirta] = (i+1) + " " + (i+2);
                idxsirta++;
              }
            }
          }
          else{
            for(int i=0;i<iin;i++){
              if(iia[i]>0){
                iia[i] += imin;
                sirta[idxsirta] = iminidx + " " + (i+1);
                idxsirta++;
              }
            }
             for(int i=iin-1;i>0;i--){
              if(iia[i-1]>iia[i]){
                iia[i-1] += iia[i];
                sirta[idxsirta] = (i+1) + " " + i;
                idxsirta++;
              }
            }          
          }
        }
        System.out.println(idxsirta);
        for(int i=0;i<idxsirta;i++){
          System.out.println(sirta[i]);
        }
    }
}
