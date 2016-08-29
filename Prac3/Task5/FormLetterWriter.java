/**
 * Created by Adam Cowie on 29/08/2016.
 */
public class FormLetterWriter {
    public static void main(String args[])
    {
        String fname="Adam";
        String lname="Cowie";
        FormLetterWriter test = new FormLetterWriter();
        test.displaySalutation(lname);
        test.displaySalutation(fname,lname);
    }
    public void displaySalutation(String lname)
    {
        System.out.println("Dear Mr. or Ms. " + lname);
        bussinessLetter();
    }
    public void displaySalutation(String fname, String lname)
    {
        System.out.println("Dear " + fname + " " + lname);
        bussinessLetter();
    }
    public void bussinessLetter()
    {
        System.out.println("Thank you for your recent order.");
    }
}