package ie.tudublin;

import processing.data.TableRow;

public class Resistor
{	
	public int value;
	public int ones;
	public int tens;
	public int hundreds;

	public void setvalue(String value)
    {
        this.value = value;
	}

	//return the value
    public String value()
    {
        return value;
	}
	
	public void setones(String ones)
    {
        this.ones = ones;
	}

	//return the ones
    public String ones()
    {
        return ones;
	}

	public void settens(String tens)
    {
        this.tens = tens;
	}

	//return the tens
    public String tens()
    {
        return tens;
	}

	public void hundreds(String hundreds)
    {
        this.hundreds = hundreds;
	}

	//return the hundreds
    public String hundreds()
    {
        return hundreds;
	}

	public String toString()
    {
        return  value + "\t" + ones + "\t" + tens + "\t" + hundreds;
	}
	
	public Resistor(TableRow row)
    {
        value = row.getInt("value");
        ones = row.getInt("ones");
        tens = row.getInt("tens");
        hundreds = row.getInt("hundreds");
	}
	public void constructor(){
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}
}
