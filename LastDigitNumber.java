import java.io.DataInputStream;
import java.io.IOException;


public class LastDigitNum {
     public static void main(String[]args)throws IOException{
        int a;
        DataInputStream d= new DataInputStream(System.in);
        a=Integer.parseInt(d.readLine());
        a=Math.abs(a)%10;
        System.out.println(a);

        }
    }