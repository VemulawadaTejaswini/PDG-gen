/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Nour
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner in=new Scanner(System.in);
int x=in.nextInt();
int i=0;

int sum=0;


while((x!=i)){

    sum=sum+i;
    i++;
}
System.out.print(sum+"\n");

}
}