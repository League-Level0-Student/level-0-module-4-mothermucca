void setup() {
      PImage waldo = loadImage("waldo.jpg"); // 5. Change this to match your file name.
      size(1200, 650);
      image(waldo, 0, 0);
     doh = minim.loadSample("homer-doh.wav");
     woohoo = minim.loadSample("homer-woohoo.wav");
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      println("X: " + mouseX + " Y: " + mouseY); 

      // 7. If the mouse is on Waldo, print “Waldo found!”
      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
      int waldoX = 1032;
      int waldoY = 100;
      
      if (mouseX > waldoX - 10 &&
          mouseX < waldoX + 10 &&
          mouseY > waldoY - 10 &&
          mouseY < waldoY + 10 ) {
        playWoohoo();
      } else {
        if (mousePressed == true) {
          playDoh();
        }
      }
      
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;