pbulic boolean canMake575(String str){
	String[] strArray = str.split(" ");
	int countFive = 0;
	int countSeven = 0;
  	for (int i = 0; i < strArray.length, i++) {
		if (strArray.equals("5")) {
          	countFive++;
        } else if (strArray.equals("7")) {
          	countSeven++;
        }
    }

	if (countFive == 2 && countSeven == 1) {
    	return true;
    }
  	return false;
}