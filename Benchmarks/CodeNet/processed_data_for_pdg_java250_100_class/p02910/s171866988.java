class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allStep = sc.next();
        String[] stepArray = allStep.split("");
        boolean easyStepFlg = true;
        String result = "";
        for(int i = 0; i < stepArray.length; i++) {
            if(i % 2 == 0) {
                if(stepArray[i].equals("L")) {
                    easyStepFlg = false;
                }
            } else if (i % 2 == 1) {
                if(stepArray[i].equals("R")) {
                    easyStepFlg = false;
                }
            } else {
                easyStepFlg = false;
            }
            if(!(stepArray[i].equals("L") || stepArray[i].equals("R") || stepArray[i].equals("U") || stepArray[i].equals("D"))) {
                easyStepFlg = false;
            }
            if(!easyStepFlg) {
                break;                
            }
        }
        if(easyStepFlg) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
    }    
}
