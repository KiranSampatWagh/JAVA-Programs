//Inteface is a blueprint of class which contain All abstract method in it.
//Interface achive 100% abstraction.

interface Circle
{
    float PI =3.14f;

    float Area(float Radius);
    float Circumfarance(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }
    public float Circumfarance(float Radius)
    {
        return 2*PI*Radius;
    }
}

class InterfaceDemo
{
    public static void main(String arr[])
    {
        System.out.println("Value of PI is :"+Circle.PI);
        //Circle.PI =7.12f;
        Circle cobj =new Marvellous();
        float Ret =0.0f;
        Ret = cobj.Area(float Radius);
        System.out.println("Area is :"+Ret);
        Ret = cobj.Circumfarance(float Radius);
        System.out.println("Circumfarance is :"+Ret);
 
    }
}