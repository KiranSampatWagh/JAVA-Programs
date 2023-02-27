     //*****///Stack///********//

import java.util.*;

class Collection7
{
    public static void main(String arg[])
    {
        Stack <Character>sobj = new Stack<Character>();
        
        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Element of Stack :"+sobj);

        System.out.println("Poped Element is :"+sobj.pop());
    
        System.out.println("Element of Stack :"+sobj);

    }
}