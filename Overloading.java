class Demo
{
    public void fun()
    {
        System.out.println("fun with parameters");
    }
    public void fun(int i)
    {
        System.out.println("fun with one integer as a parameters");
    }
    public void fun(int i, int j)
    {
        System.out.println("fun with two integer as a parameters");
    }
    public void fun(double d)
    {
        System.out.println("fun with one double as a parameters");
    }
    
}

class Overloading
{
    public static void main(String arg[])
    {
        Demo obj =new Demo();
        obj.fun();
        obj.fun(10);
        obj.fun(11,21);
        obj.fun(5.6682);
        
    }
}
