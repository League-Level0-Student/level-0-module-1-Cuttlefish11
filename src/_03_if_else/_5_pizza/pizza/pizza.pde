
PImage peppo;
PImage olive;
PImage mushroom;
void setup() {
 size (500,500);  

}
void draw() {
  fill (115,35,10,4);
  ellipse(150, 200, 250, 250); 
  fill (180,175,50,4);
  ellipse(150,200,225,225);
peppo = loadImage ("pepperoni.png"); 
image (peppo, 65,115);
olive = loadImage ("olive.png"); 
image (olive, 140,175);
mushroom = loadImage ("mushroom.png"); 
image (mushroom, 100,150); 
 
}
