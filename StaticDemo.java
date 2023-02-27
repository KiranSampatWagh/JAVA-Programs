
class Demo
{
    public int No1;             //non static char
    public int No2;              //non static char
    public static int No3;      //static char
    public static int No4;      //static char

    static                        //static block
    {
        System.out.println("Inside static block of Demo class");
        No3 =51;
        No4 =101;
    }

    public Demo()                 //constructer
    {
        System.out.println("Inside the constructer");
        No1 =11;
        No2 =21;
    }

    public void Fun()           //non ststic method 
    {
        //Non static method access all data
        System.out.println("Inside non static method Gun");
        System.out.println("value of No1:"+this.No1);
        System.out.println("value of No2:"+this.No2);
        System.out.println("value of No3:"+this.No3);
        System.out.println("value of No4:"+this.No4);
    }

    public static void Gun()           // static method
    {
        //Static method can access only static data
        //we Can't use this keyword
        System.out.println("Inside static method Gun");
        //System.out.println("value of No1:"+No1);
        //System.out.println("value of No2:"+No2);
        System.out.println("value of No3:"+No3);
        System.out.println("value of No4:"+No4);

    }
}

class StaticDemo
{
    static
    {
        System.out.println("Inside static block of StaticDemo class");
    }

    public StaticDemo()
    {
        System.out.println("Inside constructer of StaticDemo class");
    }

    public static void main(String arg[])
    {
        System.out.println("Inside main funnction");

        System.out.println("value of static No3:"+Demo.No3);    //Demo::No3
        System.out.println("value of static No3:"+Demo.No4);    //Demo::No4
        Demo.Gun();     //Demo::Gun

        Demo obj1 =new Demo();
        Demo obj2 =new Demo();
        
        obj1.Fun();
    }
}
