//abstract class is a class which contains 0 or more abstract method in it 
// Abstract class achive 0 to 100% abstraction.

abstract class Arithematic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substraction(int No1, int No2);
}

class Marvellous extends Arithematic
{
    public int Substraction(int No1, int No2)
    {
        return  No1 -No2;
    }
} 

class AbstractDemo
{
    public static void main(String arr[])
    {
        //Arithematic aobj =new Arithematic();      //NA
        Arithematic aobj =new Marvellous();
        Marvellous mobj =new Marvellous();
        int iRet =0;
        iRet =mobj.Addition(11,10);
        System.out.println("Addition is :"+iRet);
        iRet =mobj.Substraction(11,10);
        System.out.println("Substraction is :"+iRet);       
    }
} 