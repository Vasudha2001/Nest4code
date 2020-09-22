//DAY 2 ASSIGNMENT

//Question 1:

import java.util.Scanner;
class Time
{
  public static void main(String[] args)
  {
    int seconds,days,sec,min,hrs;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the time in seconds");
    seconds=input.nextInt();
    days=seconds/86400;
    sec=seconds%60;
    hrs=seconds/60;
    hrs=hrs/60;
    min=hrs/60;
    System.out.println("days:"+days+ " hours:"+hrs+ " minutes:"+min+ " seconds:"+sec);
    }
}

