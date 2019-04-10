package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	// arraylist for storing the colour
	ArrayList<Colour> colours = new ArrayList<Colour>();
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColour();
		printColours();
		findColor();
	}

	public void loadColour() {
        Table table = loadTable("colour.csv", "header");

        for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
            colours.add(colour);
        }
    }
	
	public void printColours(){
		for (Colour colour : colours){
			System.out.println(colour);
		}
	}

	public Color findColor(int value){
		for (Colour colour : colours){
			return  colour + "\t" + value;
		}
	}

	float ResWidth = 200;
	float gap = 150;

	public void drawResistance()
	{		
		textAlign(CENTER, CENTER);
		for(int i = 0; i <= 4; i++){
			rect(400, gap + i*200, 200, 200);
			line(300, gap + i*200 + 100, 400, gap + i*200 + 100);
			line(600, gap + i*200 + 100, 700, gap + i*200 + 100);
			fill(i*50);
			rect(450, gap + i*200, 50, 200);
			fill(i*55);
			rect(500, gap + i*200, 50, 200);
			fill(i*60);
			rect(550, gap + i*200, 50, 200);
		}
		textSize(32);
		text("618", 800 ,gap + 700);
		text("27", 800 ,gap + 100);
		text("195", 800 ,gap + 300);
		text("93", 800 ,gap + 500);
	}
}
