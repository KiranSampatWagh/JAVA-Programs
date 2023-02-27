
class Multi
{
    public static void main(String arg[])
    {
        //Arr is 2 dimenstional array which contain 3 dimenstional array,
        //each one dimenstional array contain 4 element,
        //each element is of type integer

        //allowed in C & C++
        //int Arr[3][4] ={{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        //allowed in only java
        int Arr[][] ={{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        System.out.println(Arr.length);     //3
        System.out.println(Arr[0].length);  //4
        System.out.println(Arr[1].length);  //4
        System.out.println(Arr[2].length);  //4

    }
}