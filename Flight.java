public class Flight implements Comparable<Flight>  {
	
	//instant variables
	private String flightCode;				//Flight Code
	private String destination;				//Destination of Flight
	private String carrier;					//Flight's Carrier Name
	private int passCap;					//Maximum Capacity of Passengers in each flight
	private double bagWeightCap;			//Maximum Capacity of Passengers' baggage weight
	private double bagVolCap;				//Maximum Capacity of Passengers' baggage volume

	
	//Constructor
	public Flight(String fc, String d, String c, int pCap, double bWCap, double bVCap) 
	{
		flightCode = fc;
		destination = d;
		carrier = c;
		passCap = pCap;
		bagWeightCap = bWCap;
		bagVolCap = bVCap;

	}
	//used for TreeSets
	public int compareTo(Flight other) {
		String thisFlight = flightCode;
		return thisFlight.compareTo(other.getFlightCode());
	}
	
	
	
	//Get Value
	public String getFlightCode() { return flightCode;}
	public String getDestination() {return destination;}
	public String getCarrier() {return carrier;}
	public int getPassCap() {return passCap;}
	public double getBagWeightCap() {return bagWeightCap;}
	public double getBagVolCap() {return bagVolCap;}
	

	

	

}
