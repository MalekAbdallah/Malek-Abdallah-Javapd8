class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println( collegeApp(3.4, 1400));

  }
  
   // #1
  String collegeApp(double gpa, int satScore){
	  if (gpa > 3.2  || satScore >= 1450)
		  return "ACCEPTED";
	  else
		  return "Not Accepted";
  }
  
	// #2
	String ecoFuel(int speed){
		if(speed>= 45 && speed <=60)
			return "Fuel Economy";
		else
			return "Not Optimal";
	}
	
	//#3
	
	double speedFine( double speed){
		if( speed>=60 && speed <=70)
			return 75;
		else if (speed>70)
			return 75+ (speed-70)*2;
		else
			return 0;
	}
	
	 //#4
	  
	double discount( double item1, double item2, double item3){
		double sum = item1+item2+item3;
		if (sum>250 && (item1>=100 || item2>=100 ||item3>=100)
			return 0.1;
		else
			return 0;
		
	}
	
	
}