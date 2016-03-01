public class Point{
  private int x;
  private int y;
  
  public Point(int a, int b){
    x = a;
    y = b;
    return;
  }
  
  public void setPoint(int a, int b){
    x = a;
    y = b;
    return;
  }
  
  public int getX(){
    return x;
  }
  
  public int getY(){
    return y;
  }
  
  // pointAdd(p) adds the x components and y components of this and p, then stores the results in this.x and this.y
  public void pointAdd(Point p){
    int tempX = this.getX();
    int tempY = this.getY();
    tempX += p.getX();
    tempY += p.getY();
    this.setPoint(tempX, tempY);
    return;
  }
  
  // simpleAdd(a,b) adds a to this.x and b to this.y
  public void simpleAdd(int a, int b){
    this.x += a;
    this.y += b;
  }
  
}