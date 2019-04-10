package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    //return the colour
    public String colour()
    {
        return colour;
    }

    public void r(int r)
    {
        this.r = r;
    }

    //return the r
    public int r()
    {
        return r;
    }

    public void g(int g)
    {
        this.g = g;
    }

    //return the g
    public int g()
    {
        return g;
    }

    public void b(int b)
    {
        this.b = b;
    }

     //return the b
    public int b()
    {
        return b;
    }

    public void value(int value)
    {
        this.value = value;
    }

    //return the value
    public int value()
    {
        return value;
    }

    public String toString()
    {
        return  colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value;
    }

    public Colour(TableRow row)
    {
        colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");
    }
    
}