package oop;

/**
 *
 * @author admin
 */
public class Array
{
    private int[] x;

    public Array()
    {
        this.x = new int[5];
        llenar();
    }
    
    public Array(int a)
    {
        this.x = new int[a];
        llenar();
    }

    public Array(int[] x)
    {
        this.x = x;
    }
    
    public Array(boolean b, int ...x)
    {
        this.x = x;
    }
    
    /**
     * @return the x
     */
    public int[] getX()
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int[] x)
    {
        this.x = x;
    }
    
    public String desplegar()
    {
        String s = "";
        
        for (int i = 0; i < x.length; i++)
        {
            s += "Dato [" + i + "] = " + x[i] + "\n";
        }
        
        return s;
    }
    
    private void llenar()
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i] = (int) (Math.random() * 100);
        }
    }
}























