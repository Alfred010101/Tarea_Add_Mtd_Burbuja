
package oop;

/**
 *
 * @author admin
 */
public class TestArray
{
    
    public static void main(String[] args)
    {
        
        //Array obj = new Array();
        //Array obj = new Array(10);
        //int arr[] = {3, 2, 90, 150, 30, 71, 26};
        Array obj = new Array(true, 2, 2, 5, 9, 100, -7, 89, 1, 7 ,-123);
        
        System.out.println(obj.desplegar());
        obj.getX()[2] = 3;
        System.out.println(obj.desplegar());
                        
    }
    
}
