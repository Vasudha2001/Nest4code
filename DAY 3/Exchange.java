import java.util.Scanner;
import java.lang.*;
class Exchange
{
  public static void main(String[] args)
  {
    String s3="",s4="";
    int a,b;
    Scanner obj=new Scanner(System.in);
    System.out.println("Ener the first string");
    String s1=obj.nextLine();
    System.out.println("Enter the second string");
    String s2=obj.nextLine();
    a=s1.length();
    b=s2.length();
    s3=s2.substring(b-2,b)+s1.substring(2,a-2)+s2.substring(0,2);
	s4=s1.substring(a-2,a)+s2.substring(2,b-2)+s1.substring(0,2);
    System.out.println("modified string1:"+s3);
    System.out.println("modified string2:"+s4);
   }
}
    