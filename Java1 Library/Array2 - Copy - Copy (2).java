import java.lang.*;
import java.util.*;


class Array2
{
    public static void main(String arg[])
    {
        int icnt=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=sobj.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements of Array");
        for(icnt=0;icnt<arr.length;icnt++)
        {
            arr[icnt]=sobj.nextInt();
        }

        System.out.println("elements if Array are");
        for(icnt=0;icnt<arr.length;icnt++)
        {
            System.out.println(arr[icnt]);
        }   
    }
}