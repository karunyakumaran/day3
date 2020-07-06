import java.io.*;
public class EvenNumber{

/**
 *@param args the command line arguments

 *@throws java.io,IoException
 */
public static void main(String[]args) throws IoException{
  int a;
  DataInputStream d=new DataInputStream(System.in);
  a=Integer.parseInt(d.readLine());
  if (a%2==0)
     System.out.println(2);
  else
     System.out.println(1);

     }
  }