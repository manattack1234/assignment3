package assignment_3;
public class Assignment_3 {

   
    public static void main(String[] args) {
       Rect one = new Rect(1,2,2,4);
       Date first = new Date(2000,5,25);
       Date seconed = new Date(2002,5,24);

       int x = 8, y = 8;
       System.out.println(one.getCircumf());//prints circumf of original rect
       System.out.println(one.getArea());//prints area of origonal rect
       one.move(x, y);//changes coordinates
       one.changeSize(9);//changes size
       
       one.print();//prints all aspects after changes
       System.out.println("--------Date section--------");
       
       
       first.print(); //prints both dates
       seconed.print();
       first.addDays(20);//adds days to the first date
       first.compare(seconed);//compares the two dates

    }
    
}
