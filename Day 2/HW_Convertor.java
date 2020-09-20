//Question 2:

import java.util.*;
import java.io.*;
public class HW_Convertor
{
  
  public static void main(String[] args)
  {
     double inches,height,weight;
     int hf,hi,wk;
     Scanner input=new Scanner(System.in);
     System.out.println("enter the height in feets");
     hf=input.nextInt();
     System.out.println("enter the height in inches");
     hi=input.nextInt();
     System.out.println("enter the weight in kgs");
     wk=input.nextInt();
     inches=hi + hf*12;
     height= inches*2.54;
     weight=wk*2.2;
     System.out.println("Height in cms"+height);
     System.out.println("weight in pounds"+weight);
  }
}