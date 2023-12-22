public String Main (int N){
        if(N < 10 || N > 100)
            return null;
        if(Integer.toString(N).contains("9") == true)
            return "Yes";
        else
            return "No";
                
    }