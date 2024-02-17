package com.sootanalysis.Examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sample_0 {

    // public void getExistingFileContents(){
    //     if (fileEncoding == null) {
    //         isr = new InputStreamReader(fis);
    //     } else {
    //         isr = new InputStreamReader(fis, fileEncoding);
    //     }
    //     BufferedReader br = new BufferedReader(isr);
    //     int returnedBytes = br.read(buffer);
    //     while (returnedBytes != -1) {
    //         sb.append(buffer, 0, returnedBytes);
    //         returnedBytes = br.read(buffer);
    //     }
    //     br.close();
    // }

    // public void future(final Callable<T> task){
    //     ExecutorService executor = Executors.newSingleThreadExecutor();
    //     Future<T> future = executor.submit( task );
    //     executor.shutdown();
    // }

    public static void main(String args[]){
        // String str = "Hello World";
        System.out.println(str);
    }
}
