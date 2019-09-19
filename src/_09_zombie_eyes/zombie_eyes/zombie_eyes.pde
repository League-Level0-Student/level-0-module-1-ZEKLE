
void setup() {
size(215, 215);

}
void draw() {
  PImage face = loadImage("Face.jpeg");
image(face, 0, 0);
face.resize(215, 215);
fill(mouseX, mouseY, 0);
ellipse(80, 30, 25, 25);
fill(mouseX, 0, mouseY);
ellipse(100, 30, 15, 15);
fill(#000000);
ellipse(90, 30, 5, 5);
fill(#000000);
ellipse(105, 30, 5, 5);





}
