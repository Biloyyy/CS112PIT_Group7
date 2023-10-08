import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String  i ;
	    double result ;
	    
	
	do{
	      	System.out.print("ENTER FIRST NUMBER : ");
		      double num1 = s.nextInt();
	      	s.nextLine();
	      	
	      	System.out.print("SELECT SYMBOL (+,x,÷,-) : ");
		      char symbol = s.next().charAt(0);
		      
		
		      System.out.print("ENTER SECOND NUMBER : ");
	      	double num2 = s.nextInt();
		      s.nextLine();
		      
	      
	
	  	switch (symbol){
			    
			    case '+':
			      result = num1 + num2;
            System.out.println("RESULTS : " + num1 +" "+symbol+" " +num2+" = "+ result);
		      	break;
		      	
			    case 'x':
			       result = num1 * num2;
			       System.out.println("RESULTS : " + num1 +" "+symbol+" " +num2+" = "+ result);
			      break;
		  
		    	case '÷':
			      result = num1 / num2;
			      System.out.println("RESULTS : " + num1 +" "+symbol+" " +num2+" = "+ result);
		      	break;
		      	
			    case '-':
			      result = num1 - num2;
			      System.out.println("RESULTS : " + num1 +" "+symbol+" " +num2+" = "+ result);
			      break;
			     
			   default:
			    System.out.println("Invalid Symbol");
		
			
			}
    
	System.out.println("----------------------------------");
	System.out.print("DO YOU WANT TO CONTINUE? YES/NO : ");
	i = s.nextLine();
	System.out.println("----------------------------------");
	System.out.println();
	  
	} while (i.equalsIgnoreCase("yes") || i.equalsIgnoreCase("y"));
		
	}
}