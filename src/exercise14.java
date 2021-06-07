import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int orderAmt=0;
	    String state="";
	    double tax=0;
	    System.out.println("What is the order amount?");
		orderAmt= Integer.parseInt(kb.nextLine());
		System.out.println("What is the state?");
	    state= kb.nextLine();
	    if(state.equals("WI")){
	        tax=orderAmt*0.055;
        }
	    double total= tax+orderAmt;
	    System.out.println("The subtotal is $"+orderAmt+"."+"\n"+"The tax is $"+tax+"."+"\n"+"The total is $"+total+".");


    }

}
