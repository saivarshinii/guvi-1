/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Space
{
 public static void main(String args[])
 {
  int word=1;
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
 
  for(int i=0;i<str.length();++i)
  {
   if(str.charAt(i)==' ')
    word++;
  }
 
  System.out.println((word-1));
 }
}
