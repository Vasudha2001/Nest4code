//DAY 5 ASSIGNMENT

//Question1:



import java.util.Scanner;
class Fibonacci
{
  public static void main(String[] args)
  { 
    int a=0,b=1,i,n,c;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    n=obj.nextInt();
    System.out.println("Fibonocci Series:");
    for(i=1;i<=n;i++)
    {
      System.out.println(a+" ");
      c=a+b;
      a=b;
      b=c;
      
    }
  }
}