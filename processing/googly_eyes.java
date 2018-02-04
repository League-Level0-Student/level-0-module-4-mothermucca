import java.awt.geom.*;

int eyeX = 100;
int eyeY = 100;
int eyeW = 100;
int eyeH = 50;
int pupilDiam = 25;
int eyeDistance = 150;
int lastMouseX = eyeX;
int lastMouseY = eyeY;

void setup() {
  size(350, 200);
}

void draw() {

  
  fill(255, 255, 255);
  ellipse(eyeX, eyeY, eyeW, eyeH);
  ellipse(eyeX + eyeDistance, eyeY, eyeW, eyeH);
  
  fill(0, 0, 0);
  
  if (inLeftEye()) { 
    ellipse(mouseX, mouseY, pupilDiam, pupilDiam);
    ellipse(mouseX + eyeDistance, mouseY, pupilDiam, pupilDiam);
    lastMouseX = mouseX;
    lastMouseY = mouseY;    
  } else {
    ellipse(lastMouseX, lastMouseY, pupilDiam, pupilDiam);
    ellipse(lastMouseX + eyeDistance, lastMouseY, pupilDiam, pupilDiam);
  }
}

boolean inLeftEye() {
  int x = eyeX - eyeW/2;
  int y = eyeY - eyeH/2;
  int w = eyeW;
  int h = eyeH;
  Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, w, h);
  
  boolean contains = ellipse2D.contains(mouseX, mouseY, pupilDiam, pupilDiam);
  return contains;
}