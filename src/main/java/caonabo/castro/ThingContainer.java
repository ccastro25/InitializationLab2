package caonabo.castro;


/**
 * Created by castro on 9/10/16.
 */
public class ThingContainer {


    ColorfulThing[] colorfulThings;
    public int sizeOFArray;

    int count = 0;

    public String arrayIsFullMessage;


    public ThingContainer(int sizeOFArray) {

        this.sizeOFArray = sizeOFArray;
        colorfulThings = new ColorfulThing[sizeOFArray];
    }


    public void add(ColorfulThing color) {


        if (colorfulThings.length != count) {
            colorfulThings[count] = color;

            count++;

        } else {

            arrayIsFullMessage = "ThingContainer is full";
            System.out.println(arrayIsFullMessage);
        }

    }

    public ColorfulThing pop() {
        ColorfulThing returnRemoved = colorfulThings[sizeOFArray - 1];

        colorfulThings[sizeOFArray - 1] = null;

        count--;
        return returnRemoved;
    }


    public String getThingContainer() {

        return colorfulThings[0].getColorfulThing();
    }


    public void printThing() {

        for (int i = 0; i < sizeOFArray; i++) {

            System.out.println(colorfulThings[i].getColorfulThing());
        }

    }

    public String  remove(ColorfulThing.Color color) {
            String removedColor=null;

        for (int i = 0; i < sizeOFArray; i++) {


            if (colorfulThings[i].getColorfulThing().equalsIgnoreCase(color.toString())) {

                removedColor= colorfulThings[i].getColorfulThing();
                colorfulThings[i] = null;


            }

        }
        return removedColor;
    }


    public String remove(ColorfulThing colorfulThing){
        String removedColorfulThing=null;

        for (int i = 0; i < sizeOFArray; i++) {

            if(this.colorfulThings[i]== colorfulThing ){

                removedColorfulThing= colorfulThings[i].getColorfulThing();
                colorfulThings[i] = null;
            }



        }


        return removedColorfulThing;
    }




}
