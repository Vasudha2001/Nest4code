//Question 3:


import java.util.Scanner;
class Palindrome
{
  public static void main(String[] args)
  {
    String str,rev="";
    int x,i;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a string");
    str=obj.nextLine();
    x=str.length();
    for(i=x-1;i>=0;i--)
    {
      rev=rev+str.charAt(i);
    }
    if(str.equalsIgnoreCase(rev))
      System.out.println("It is a palindrome");
    else
      System.out.println("It is not a palindrome");
   }
}
    

    
