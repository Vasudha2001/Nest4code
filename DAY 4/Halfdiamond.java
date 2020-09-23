// QUESTION 2:


import java.util.Scanner;
class Halfdiamond
{
  public static void main(String[] args)
  {
    int i,j;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=obj.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(i=0;i<=n-1;i++)
    {
      for(j=n-1;j>=i;j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}