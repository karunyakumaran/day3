    import java.io.DataInputStream;
    import java.io.IOExeception;

    public class OddNumber {
   


   public static void main(String[] args trows IOException {
       int a;
       DataInputStream d=new DataInputStream(System.in);
       a=Integer.parseInt(d.readLine());
       if (a%2!=0)
              System.out.println(2);
       else
              System.out.println(1);
        }
   }