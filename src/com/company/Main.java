package com.company;

public class Main
{

    public static void main(String[] args)
    {


        java.util.Scanner userinput = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number");
        int numberEntered = userinput.nextInt();

        int totalGoal = 1000;
        int numberTotal = numberEntered;
        int numbersOfNumbers = 1;

        while (numberTotal <= totalGoal)
        {
            System.out.println("Total not reached.");
            System.out.println("Please enter another number.");

            numberEntered = userinput.nextInt();
            numbersOfNumbers ++;
            numberTotal = numberTotal + numberEntered;
        }



        System.out.println("You reached the total of " + numberTotal + " to finally obtain a total greater than 1000.");

        if (numbersOfNumbers == 1)
        {
            System.out.println("You entered " + numbersOfNumbers + " number.");
        }
        else
        {
            System.out.println("You entered " + numbersOfNumbers + " numbers.");
        }






    }


}