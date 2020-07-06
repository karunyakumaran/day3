public class SecondLastNum {
       public static void main(String[] args) trrows IOException{
            int a;
            DataInputStream d=new DataInputSream(System.in);
            a=Integer.parseInt(d.readLine());
            if (a==a%10)
            { 
                   System.out.println(-1);
             }
            else
             {
                a=Math.abs(a)%100/10;
             System.out.println(a);
               }
           }
   }
    