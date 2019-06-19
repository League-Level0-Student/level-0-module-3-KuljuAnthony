int X =200;
int X2=600;
void draw() {
  background(255,255,255);
  noFill();
  X+=2;
  X2-=2;
  if(X==800) {
    X=0;
  }
  if(X2==0) {
    X2=800;
  }
  for(int i=0; i<15; i++) {
  
  ellipse(X,400,20*i,20*i);

  }
  for(int i=0; i<15; i++) {
  ellipse(X2,400,20*i,20*i);
  }
}
void setup() {
    size(800,800);
}