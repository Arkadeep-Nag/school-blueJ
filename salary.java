/**
 * Write a description of class salary here.
 *
 * @author Arkadeep Nag
 * @version 1.0.0
 */
public class salary
{
    // instance variables - replace the example below with your own
    public static void main(){
        int pdays , abdays , fine , add ;
        pdays = 25 ;
        abdays = 5 ; //The days in month calculated as 30 days
        fine = 30;
        add = 300 ;
        int salary = (add * pdays) - (fine*abdays);
        System.out.println(salary);
        
    }
}
