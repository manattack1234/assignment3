
package assignment_3;

/**
 * 
 * @author rydan
 */
public class Rect {//creats Rect class
    int length;
    int width;
    int x;
    int y;
  
    public Rect(int length, int width,  int x, int y)
    {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
        
    }
    
    /**
     * 
     * @return the circumference of the Rect
     */
    public int getCircumf(){
        int c;
        c = 2*(this.length + this.width);
        return c;
    }
    /**
     * 
     * @return the area of the Rect
     */
    public int getArea(){
        int a;
        a = this.length * this.width;
        return a;
    }
    
    /**
     * will change the position of the Rect
     * @param x x coordinate
     * @param y y coordinate
     */
    public void move(int x, int y){
            this.x = x;
            this.y = y;
    }
    /**
     * changes the size of the Rect
     * @param n new side length
     */
    public void changeSize(int n){
        this.length = n;
        this.width = n;
    }
    /**
     * prints all length, width, coordinates, circumference, and area of the 
     * Rect
     */
    public void print(){
        System.out.println(this.length + ", " + this.width + ", " + this.x 
                + ", " + this.y + ", " + this.getCircumf() + ", " + 
                this.getArea());
    }
           
}

