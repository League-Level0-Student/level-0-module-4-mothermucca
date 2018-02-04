PImage creeper;     //at the top 
int creeperX = 294;
int creeperY = 715;
int creeperSizeX = 23;
int creeperSizeY = 46;

void setup() {
  PImage minecraft = loadImage("minecraft.jpg");     //in setup method
  size(1280, 768);
  minecraft.resize(1280, 768);     //in setup method
  background(minecraft);     //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(creeperSizeX, creeperSizeY);
  image(creeper, creeperX - creeperSizeX/2, creeperY - creeperSizeY/2);
}

void draw() {
  println("mouse: " + pmouseX + ", " + pmouseY);
  if (mousePressed == true) {
    if (isNear(pmouseX, creeperX) && isNear(pmouseY, creeperY)) { 
      stroke(0, 192, 0);
    } else {
      stroke( 255, 0, 0);
    }
    noFill();
    ellipse(pmouseX, pmouseY, 50, 50);
  }
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}