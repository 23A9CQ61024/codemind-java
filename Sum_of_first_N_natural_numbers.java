import java.util.Scanner;
public class Add{
    public static void main(String[] args)
    {
        int a,n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        a=n*(n+1)/2;
        System.out.println(a);
}
}