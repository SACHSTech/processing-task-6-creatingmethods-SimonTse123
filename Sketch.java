import processing.core.PApplet;
import java.util.Random;
public class Sketch extends PApplet {
	
	
 // Size of Sketch
  public void settings() {
    size(800, 400);
  }

  public void setup() {
    background(166, 247, 173);
    noLoop();
  }

  public void draw() {
    coordinatesMan(100, 75);
    coordinateCircle(200, 100);
	  
  }
/**
 * Description : A method that draws stickman in a grid-like format
 * 
 * @param intX   How spaced out each stickman is from each other horizontally
 * @param intY   How spaced out each stickman is from each other vertically (higher than 50 because each stickman is 50 units tall)
 */
  private void coordinatesMan(int intX, int intY){
    for (int i = 0; i < (800 - intX); i += intX){
      for (int c = 0; c < (400 - intY); c += intY){
        stickman(60 + i, 40 + c , 60 + i, 70 + c);
      } 
    }
  }

/**
 * Descriptions : A method that makes a stickman based on a line that uses 4 variables and changes colours of the stickmen based on random numbers
 * @param int1    The first x coordinate of the line
 * @param int2    The first y coordinate of the line
 * @param int3    The second x coordinate of the line
 * @param int4    The second y coordinate of the line
 */
  private void stickman(int int1, int int2, int int3, int int4){
    Random myRandom = new Random();
    boolean blnColourPicker = colourpicker1(myRandom.nextInt(1,20), myRandom.nextInt(1, 20));
    if(blnColourPicker){
        stroke(250, 208, 125);
      }
    else{
        stroke(164, 89, 255);
      }
      fill(166, 247, 173);
      line(int1, int2, int3, int4);  
      ellipse(int1, int2 - 10, 20, 20);
      line(int1, int2 + 15, int3 - 15, int4 - 30);
      line(int1, int2 + 15, int3 + 15, int4 - 30);
      line(int1, int2 + 30, int3 - 10, int4 + 10);
      line(int1, int2 + 30, int3 + 10, int4 + 10);
  }

  /**
   * Description : A method that changes the colour of the stickman depending on whether the product of 2 variables is divisble by 2 or not
   * @param intA    A variable based on a random number
   * @param intB    Another variable based on a random number
   */
  private boolean colourpicker1(int intA, int intB){
    if ((intA * intB) % 2 == 0){
      return true;
    }
    else{
      return false;
    }
  }

  /**
   * Description : A method that draws a cherry-like shape amd changes colour depending on random variables
   * 
   * @param intRadiusX A variable that determines horizontal length of shape
   * @param intRadiusY A variable that determines the vertical length of shape
   * @param intCentreX A variable that determines the x coordinate of the intital starting point of the cherry
   * @param intCentreY A variable that dertermine the y coordinate of the intial starting point of the cherry
   */
    private void CircleCreation(int intCentreX, int intCentreY, int intRadiusX, int intRadiusY){
      stroke(1);
      Random myRandom = new Random();
      boolean blnColourPicker2 = colourpicker2(myRandom.nextInt(1,20), myRandom.nextInt(1, 20));
      if(blnColourPicker2){
        fill(255, 46, 95);
      }
      else{
        fill(0, 138, 87);
      }
      ellipse(intCentreX, intCentreY, intRadiusX, intRadiusY);
      stroke(67, 122, 0);
      line(intCentreX, intCentreY - intRadiusY / 2, intCentreX + intRadiusX / 2, intCentreY - intRadiusY / 2 - 20);
    }

  /**
   * Description : A method that draws the cherries in a grid-like format
   * 
   * @param intM   How spaced out each cherry is from each other horizontally
   * @param intN   How spaced out each cherry is from each other vertically
   */
  private void coordinateCircle( int intM, int intN){
    for (int d = 0; d <= (800 - intM); d += intM){
      for (int e = 0; e <= (400 - intN); e += intN){
        CircleCreation(130 + d, 50 + e , 30, 30);
      } 
    }
  }
  /**
   * Description : A method that changes the colour of the cherries depending on whether the sum of 2 variables is divisble by 2 or not
   * @param intS    A variable based on a random number
   * @param intT    Another variable based on a random number
   */
  private boolean colourpicker2(int intS, int intT){
    if ((intS + intT) % 2 == 0){
      return true;
    }
    else{
      return false;
    }
  }
}