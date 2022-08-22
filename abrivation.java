/*
Program: abrivation DOB,LOL,OMG,TTYS,HMB
@Author : Siddhant Amruktar
@date : 22 august 2022
*/

// declaring Class
class abrivation
{    //creating a method to print the form of abrivation
	 static void ShortForm(String SortFor)
	 {
		
		//switch case start
       switch(SortFor){
	    // if the Abbv is DOB
		case "DOB"->System.out.println("Date of birth");
		 // if the Abbv is LOL
		case "LOL"->System.out.println("Laugh out loud");
		 // if the Abbv is OMG
		case "OMG"->System.out.println("Oh my god");
	     // if the Abbv is TTYS
		case "TTYS"->System.out.println("Talk to you soon");
		 // if the Abbv is HMB
		case "HMB"->System.out.println("Hit me back");
		
		// Wrong input
		default -> System.out.println("only DOB,LOL,OMG,TTYS,HMB ");
	 }//switch end

	 }		 
	 //calling main 
	 public static void main(String arg[])
	 {
	 //String SortFor(arg[0]);
	 //calling SortFrom method
	   ShortForm(arg[0].toUpperCase());// passing 1 string command line argument and
	 }
	 
	 
}
