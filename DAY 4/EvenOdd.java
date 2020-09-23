//DAY 4 ASSIGNMENT

//Question 1:



import java.util.Scanner;
class EvenOdd
{
  public static void main(String[] args)
  { 
    int n,odd=0,even=0,rem;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a number");
    n=obj.nextInt();
    while(n>0)
    {
     rem=n%10;
    if(rem%2==0)
    { 
      even=even+1;
    }
    else
    { 
      odd+=1;
    }
    n=n/10;
    }
    System.out.println("Even Digit:"+even);
    System.out.println("Odd Digit:"+odd);
  }
}
      
     
      