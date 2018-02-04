import ddf.minim.*;     //at the very top of your sketch

AudioSample winner;     //at the top of your sketch
AudioSample loser;
PImage donkey;     
PImage tail;
int tailX = 262;
int tailY = 192;
boolean pinned = false;

void setup() {
  Minim minim = new Minim(this);     //in the setup method  
  winner = minim.loadSample("ding.wav");     //in setup
  loser = minim.loadSample("buzz.wav");     //in setup
  donkey = loadImage("donkey.jpg");     
  tail = loadImage("tail.jpg");

  size(1280, 853);
  donkey.resize(1280, 0);
  tail.resize(0, 300);
  background(donkey);     
}

void draw() {
  if (!pinned) {
    if (mouseX < 100 || mouseY < 100 ) {
        background(donkey); 
    } else {
      // cover the donkey picture
      fill(0, 0, 0);
      rect(0, 0, 1280, 853);
      
      // print the instructions
      fill(255, 255, 255);
      textSize(24);
      text("Pin the tail on the donkey!", 100, 100);
    }
  }
      
  if (mousePressed == true) {
    println("mouse: " + mouseX + ", " + mouseY);
    background(donkey);
    image(tail, mouseX-50, mouseY-40);
    
    if (isNear(mouseX, tailX) && isNear(mouseY, tailY)) {
      pinned = true;
      winner.trigger();     //where you want the sound to play
    } else {
      loser.trigger();
    }
  }
}

boolean isNear(int a, int b) {
if (abs(a - b) < 50)
     return true;
else
     return false;
}