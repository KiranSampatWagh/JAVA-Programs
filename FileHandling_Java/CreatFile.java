import java.io.*;

class CreatFile
{
    public static void main(String Arg[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File created succesfully");
        }
        else
        {
            System.out.println("Unable to created the File");
        }
    }
}