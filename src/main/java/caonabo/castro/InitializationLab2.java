package caonabo.castro;

import sun.text.resources.ro.CollationData_ro;

/**
 * Created by castro on 9/10/16.
 */
public class InitializationLab2 {

    public static void main(String[] args) {
        ThingContainer thingContainer1= new ThingContainer(3);


        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.red);
        ColorfulThing black = new ColorfulThing(ColorfulThing.Color.black);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.blue);

        thingContainer1.add(red);
        thingContainer1.add(black);
        thingContainer1.add(black);
        thingContainer1.printThing();
        thingContainer1.pop();
        thingContainer1.add(blue);
        thingContainer1.printThing();
        thingContainer1.remove(black);


}

}
