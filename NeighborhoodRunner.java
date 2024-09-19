import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

 MuralPainter adam = new MuralPainter();
 PrismPainter cam = new PrismPainter();

    //Paints backround
    adam.paintBackground("LightBlue", 16);

    //draws the outline of the prism
    cam.drawOutline();

    //gets into position to fill the left inside of the Prism
    cam.turnLeft();
    cam.move();
    cam.turnLeft();
    cam.move();

    //paints the left inside of the prism
    cam.fillInsideLeft();

    //gets into position to fill the right inside of the Prism
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.turnRight();
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.move();
    cam.turnRight();
    
    //paints the right inside of the prism
    cam.fillInsideRight();

    //moves off the painting for a better look
    cam.moveToCorner();
  }
}