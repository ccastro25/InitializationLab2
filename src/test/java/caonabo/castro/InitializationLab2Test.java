package caonabo.castro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/10/16.
 */
public class InitializationLab2Test {


    ColorfulThing black = new ColorfulThing(ColorfulThing.Color.black);
    ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.blue);


    ThingContainer thingContainertest = new ThingContainer(2);

    @Test
    public void addTest(){

        thingContainertest.add(black);
        thingContainertest.add(blue);

        String expected = ColorfulThing.Color.black.toString();
        String actual   =  black.getColorfulThing();


        Assert.assertEquals("this should return black",expected,actual);

    }


    @Test
     public void isArrayFullOrNOt(){

        thingContainertest.add(black);
        thingContainertest.add(blue);
        thingContainertest.add(blue);

        String expect ="ThingContainer is full";

       String actaul = thingContainertest.arrayIsFullMessage;

       Assert.assertEquals("Method should return that the container is full ",expect,actaul);
     }



    @Test
    public void popTest(){
        thingContainertest.add(blue);
        thingContainertest.add(blue);

      String expected= blue.getColorfulThing();
      String actual= thingContainertest.pop().getColorfulThing();
        Assert.assertEquals("this removes last array and return it", expected,actual);
    }


    @Test
    public void removeColorTest(){

        thingContainertest.add(black);
        thingContainertest.add(blue);

        String expected = black.getColorfulThing();
         String actual = thingContainertest.remove(ColorfulThing.Color.black);


        Assert.assertEquals("this should return the first uccurance",expected,actual);

    }
    @Test
      public void removeColorfulThing(){

          thingContainertest.add(black);
          thingContainertest.add(blue);


          String expected = black.getColorfulThing();
          String actual = thingContainertest.remove(black);


          Assert.assertEquals("this should return the first uccurance",expected,actual);


      }




}
