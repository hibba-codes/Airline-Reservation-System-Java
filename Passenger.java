abstract class Passenger
{
    private String passengerName;
    private String passportNumber;
    private String destination;


    public Passenger(String name, String num, String destination)
    {
        this.passengerName = name;
        this.passportNumber = num;
        this.destination = destination;
    }
    public void setPassengerName(String name)
    {
        this.passengerName = name;
    }
    public void setPassportNumber(String num)
    {
        this.passportNumber = num;
    }
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void showInfo()
    {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Passport Number : " + passportNumber);
        System.out.println("Destination : " + destination);
    }
    public abstract double get_Ticket_Price();
    public abstract void calculate_Ticket_Price();

}abstract class Passenger
{
    private String passengerName;
    private String passportNumber;
    private String destination;


    public Passenger(String name, String num, String destination)
    {
        this.passengerName = name;
        this.passportNumber = num;
        this.destination = destination;
    }
    public void setPassengerName(String name)
    {
        this.passengerName = name;
    }
    public void setPassportNumber(String num)
    {
        this.passportNumber = num;
    }
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void showInfo()
    {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Passport Number : " + passportNumber);
        System.out.println("Destination : " + destination);
    }
    public abstract double get_Ticket_Price();
    public abstract void calculate_Ticket_Price();

}
