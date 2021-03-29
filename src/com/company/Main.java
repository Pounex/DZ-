package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Введите номер месяца для первого варианта");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

	if (month == 12 | (month>=1 && month <=2 ))
    {
        System.out.println("Зима");
    }
    if (month >= 3 && month <= 5)
	{
            System.out.println("Весна");
        }
	if (month >= 6 && month <= 8)

        {
            System.out.println("Лето");
        }
	if (month >= 9 && month <= 11)
        {
            System.out.println("Осень");
        }
	if (month< 1 | month > 12)
        System.out.println("Нет такого месяца");


        System.out.println("Введите номер месяца для второго варианта");
	int month1 = sc.nextInt();
       switch (month1)
       {
           case 1:
               System.out.println("Зима");
               break;
           case 2:
               System.out.println("Зима");
               break;
           case 3:
               System.out.println("Весна");
               break;
           case 4:
               System.out.println("Весна");
               break;
           case 5:
               System.out.println("Весна");
               break;
           case 6:
               System.out.println("Лето");
               break;
           case 7:
               System.out.println("Лето");
               break;
           case 8:
               System.out.println("Лето");
               break;
           case 9:
               System.out.println("Осень");
               break;
           case 10:
               System.out.println("Осень");
               break;
           case 11:
               System.out.println("Осень");
               break;
           case 12:
               System.out.println("Зима");
               break;
           default:
               System.out.println("Нет такого месяца");


       }


        int[] array = new int[10];

        array[0]=10;
        array[1]=11;
        array[2]=12;
        array[3]=13;
        array[4]=14;
        array[5]=15;
        array[6]=16;
        array[7]=17;
        array[8]=18;
        array[9]=19;

        for ( int i = (array.length-1) ; i >=0; i--)
        {
            System.out.println(array[i]);
        }


        int[][] squareArray = new int[2][3];
        squareArray[0][0]=11;
        squareArray[0][1]=12;
        squareArray[0][2]=13;
        squareArray[1][0]=14;
        squareArray[1][1]=15;
        squareArray[1][2]=15;
  for (int n = 0; n< squareArray.length; n++)
      {
          for (int m = 0; m< squareArray[n].length;m++)
          {
              System.out.print(squareArray[n][m]+"["+n+"]"+"["+m+"] ");
          }
          System.out.println();
      }
    }
}
