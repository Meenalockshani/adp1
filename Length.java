    import java.io.*;
public class Length
{
    public static void main(String arg[]) throws IOException
    {
    int n;
     BufferedReader ap=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number ");
  n=Integer.parseInt(ap.readLine());
       int length = (int)(Math.log10(n)+1);
       System.out.println(length);
    
    }
}
