PImage face;
void setup() {
size (600,600);
}
void draw() {
face = loadImage ("face2.jpg"); 
image (face, 1,1);
fill (#F70724);
ellipse (225,300,75,75);
fill (#F70724);
ellipse (324,300,75,75);
fill (#150104);
ellipse (225,300,40,40);
fill (#150104);
ellipse (324,300,40,40);
}
