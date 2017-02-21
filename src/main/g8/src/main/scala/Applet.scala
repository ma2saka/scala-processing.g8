package $package$

import processing.core.PApplet
import processing.core.PConstants._

class Applet extends PApplet{
  lazy val BG_COLOR = { color(0,0,100) }

  override def settings(): Unit = {

    size(320, 240, JAVA2D)

  }


  override def setup(): Unit = {

    surface.setTitle("$title$")
    smooth()
    frameRate(30)

  }


  override def draw(): Unit ={

    background(BG_COLOR)

    textAlign(LEFT, TOP)
    text(s"$"$"$mouseX, $"$"$mouseY",0 ,0)

    textAlign(CENTER, CENTER)
    text("$title$", width/2, height/2)

  }
}


