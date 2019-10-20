package src;

import java.util.Arrays;
import java.util.Scanner;


public class hw2 {
    public static void main (String[] args) {



        String[][] numbers = {
                {"0","1","2","3","4","5"},
                {"1","-","-","-","-","-",},
                {"2","-","-","-","-","-",},
                {"3","-","-","-","-","-",},
                {"4","-","-","-","-","-",},
                {"5","-","-","-","-","-",}
        };

        //int strArray[][] = Arrays.toString(numbers);

        Scanner input1 = new Scanner(System.in);
        int row;
        System.out.println("Enter row: " + row);
        row = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int column;
        System.out.println("Enter column: " + column);
        column = input2.nextInt();
        int kkk;


        //int[row][column]numbers = int[][];

        for (int i=0; i<numbers.length;i++){

            for (int j=0; j<numbers[i].length ;j++ ){

                System.out.print(numbers[i][j] + " | ");
            }
            System.out.println();
        }

        if (row>1 && column>1  && row<numbers.length && column<numbers.length)
        {
            int[row][column]numbers = int[][];
        }
        else
        {
            System.out.println("Invalid input.......");
        }


    }

}
