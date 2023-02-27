class Base
{
    public void fun()
    {
         System.out.println("Inside Base fun");
    }
    public void gun()
    {
         System.out.println("Inside Base gun");
    }
    public void sun()
    {
         System.out.println("Inside Base sun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside Derived fun");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
    public void run()
    {
        System.out.println("Inside Derived run");
    }
}

class RMD
{
    public static void main(String arg[])
    {
        Base bobj =new Base();          //upcasting
        bobj.fun();
        bobj.gun();
        bobj.sun();
        //bobj.run();   //error 
    }
}