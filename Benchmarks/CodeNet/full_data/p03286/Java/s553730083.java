fun main() {
    val n = readLine()!!
    var numN = n.toLong()

    var ans = ""

    while(numN != 0L) {
        if(numN % 2 != 0L) {
            numN--;
            ans = "1$ans";
        } else {
            ans = "0$ans";
        }
        numN /= -2;
    }

    if(ans == "") {
        println("0");
    }else {
        println(ans);
    }

}

