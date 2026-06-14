class Economic_Passenger extends Passenger
{
    int seats;
    double pricePerSeat;
    public Economic_Passenger(String name, String num, String destination, int seats, double price)
    {
        super(name, num, destination);
        this.seats = seats;
        this.pricePerSeat = price;
    }
    public double get_Ticket_Price() {
        return pricePerSeat * seats;
    }
    public void calculate_Ticket_Price()
    {
        double totalPrice = pricePerSeat * seats;
        if(totalPrice > 50000)
        {
            System.out.println("Seat Type : Premium Economy");
        }
        else
        {
            System.out.println("Seat Types : Economy");
        }
        System.out.println("Seats : " + seats);
        System.out.println("Price Per Seat : " + pricePerSeat);
        System.out.println("Total Price : " + totalPrice);
    }

}
