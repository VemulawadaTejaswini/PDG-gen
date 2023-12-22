import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int num = 1000;
        int div = 2;
        int i = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(true) {
            if(num % div == 0) {
                num /= div;
                array.add(div);
                continue;
            }else if(num <= 1) {
                break;
            }else{
                div++;
            }
        }
        boolean isSquare = false;

        if(array.size() == 1) {
            ;
        } else {
            int tmpNum = 0;
            for(int j=0; j<array.size(); j++) {

                tmpNum = array.get(j);
                for(int jj=0; jj<array.size(); jj++) {
                    if(tmpNum == array.get(jj)) {
                        isSquare = true;
                        break;
                    } else {
                        isSquare = false;
                    }
                }
            }
        }
        System.out.println(isSquare);
    }
}
