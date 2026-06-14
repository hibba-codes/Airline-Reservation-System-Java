class Business_Passenger extends Passenger
{
    int seats;
    double pricePerSeat;
    boolean loungeAccess;
    public Business_Passenger(String name, String num, String destination,
                              int seats, double price, boolean loungeAccess )
    {
        super(name, num, destination);
        this.seats = seats;
        this.pricePerSeat = price;
        this.loungeAccess = loungeAccess;
    }
    public double get_Ticket_Price()
    {
        double totalPrice = pricePerSeat * seats;

        if(loungeAccess)
        {
            totalPrice += 10000;
        }

        return totalPrice;

    }
    public void calculate_Ticket_Price()
    {
        double totalPrice = pricePerSeat * seats;
        if(loungeAccess)
        {
            totalPrice += 10000;

        }
        System.out.println("Seats : " + seats);
        System.out.println("Price Per Seat : " + pricePerSeat);
        System.out.println("Total Price : " + totalPrice);
        if(loungeAccess)
        {
            System.out.println("Lounge Access : Yes");
        }
        else
        {
            System.out.println("Lounge Access : No");
        }
    }

}
