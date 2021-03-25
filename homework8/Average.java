package homework8;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write three numbers: ");
        int firstnumber=input.nextInt();
        int secondnumber=input.nextInt();
        int thirdnumber=input.nextInt();
        Average average1=new Average();
        float averagelast=average1.average(firstnumber,secondnumber,thirdnumber);
        System.out.println("average of three numbers: "+averagelast);




    }public float average(int a,int b,int c){
        float average=(float)(a+b+c)/3;
        return average;
    }


}
