public class Main
{
    public static void main(String[] args)
    {
        double totalRevenue = 0;
        Passenger[] Passengers = new Passenger[5];
        Passengers[0] = new Economic_Passenger("Ahmed", "Ab123564",
                "Dubai",4, 10000);
        Passengers[1] = new Business_Passenger("Imran Khan", "IM236574",
                "Dubai",3, 25000, true);
        Passengers[2] = new Economic_Passenger("Ali", "KC8663845",
                "Dubai",3, 10000);
        Passengers[3] = new Business_Passenger("Hayat", "HD5758759",
                "Dubai",2, 25000, false);
        Passengers[4] = new Economic_Passenger("Bilal", "MU6587720",
                "Dubai",7, 10000);

        System.out.println("\n==========Airline Reservation System==========\n");
        for(int i = 0; i < Passengers.length; i ++)
        {
            Passengers[i].showInfo();
            Passengers[i].calculate_Ticket_Price();
            totalRevenue += Passengers[i].get_Ticket_Price();
            System.out.println("\n============================================\n");
        }
        System.out.println("Total AirLine Revenue : " + totalRevenue);
        System.out.println("\n============================================");
    }
}
