
package assignment_3;

/**
 *
 * @author rydan
 */
public class Date {
    int year;
    int month;
    int day;
    
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /**
     * prints out the date
     */
    public void print(){
        System.out.println(this.year + "/" + this.month + "/" + this.day);
    }
    
    /**
     * will add entered amount of days to the date
     * @param n any int value from 1-31
     */
    public void addDays(int n){
        int sum;
        if (n>31){
            System.out.println("invalid date input");
            return;
        }
        sum = n + this.day;
        if (sum > 31){
            this.day = sum - 31;
            this.month += 1;
            if (this.month > 12 ){
                this.month = 1;
                this.year +=1;
            }
        }
        else 
           this.day = sum;
      
    }
    /**
     * compares two dates and prints the number of days between them
     * @param x date to be compared
     */
    public void compare(Date x){
        int t1,t2,days;
        t1 = ((this.year - 1)* 365) + ((this.month-1) * 31 ) + this.day;
        t2 = ((x.year - 1)* 365) + ((x.month-1) * 31 ) + x.day;
        if (t1>t2){
            days = t1 - t2;
            System.out.println("the dates are " + days + " apart");
                   }
        else{
            days = t2 - t1;
            System.out.println("the dates are " + days + " apart");
        }
    }
    
}
