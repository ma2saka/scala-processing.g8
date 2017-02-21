package $package$

import processing.core.PApplet
import processing.core.PConstants._

class Applet extends PApplet{

  override def settings(): Unit = {

    size(200, 200, JAVA2D)

  }

  override def draw(): Unit ={

    background(0)
    textAlign(LEFT, TOP)

    text("%d, %d".format(mouseX,mouseY),0,0)

  }
}

