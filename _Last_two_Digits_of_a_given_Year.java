import java.util.Scanner;
public class last{
    public static void main(String[] args)
    {
        int n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        System.out.printf("%02d",n%100);
    }
}