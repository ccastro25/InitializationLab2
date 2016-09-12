package caonabo.castro;

/**
 * Created by castro on 9/10/16.
 */
public class ColorfulThing {

    public Color colorString;

    public enum Color {
        blue, green,black,yellow,red
    }

    public ColorfulThing( Color colorString){
        this.colorString = colorString;

    }

    public String getColorfulThing(){

        return String.valueOf(colorString);
    }


    public void printColor(){

        System.out.println(this.colorString);
    }




}
