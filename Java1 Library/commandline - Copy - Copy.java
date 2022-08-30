import java.lang.*;

class commandline
{
    public static void main(String Arg[])
    {
        System.out.println("first number is:"+Arg[0]);
        System.out.println("first number is:"+Arg[1]);

        int ans=Integer.parseInt(Arg[0])+Integer.parseInt(Arg[1]);
        System.out.println("Addition is:"+ans);

    }  
}

////     javac commandline.java   /////     <-- compilation
////     java commandline 10 11   ////      <-- run