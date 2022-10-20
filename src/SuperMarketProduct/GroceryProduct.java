package SuperMarketProduct;

import java.util.ArrayList;



public class GroceryProduct {

    private String name;
    private double price;
    private double discount;

    public GroceryProduct(String name, double price, double discount){
        this.name=name;
        this.discount = discount;
        this.price=price;
    }

        public double getActualPrice()
        {
            return price= (price-(price*discount/100));
        }

    public String display(){
        return (
                "Name: "+name+"\n"+
                        "Price: "+price+"\n"+
                        "Discount: "+discount+"%");
    }

// As these are the private variables, so, we need getter and setter to access these.
    // How can we gat these automatically? Ans. Click on the 'code' in menu bar, then Generate, then getter and setter
    // after then by holding 'Command/ctrl" key select all. then click ok.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public static void main(String[] args)
    {
        ArrayList<GroceryProduct> cart = new ArrayList<GroceryProduct>();
        GroceryProduct toast = new GroceryProduct("Toast", 2.5, 10);
        cart.add(toast);
        BeverageProduct coke = new BeverageProduct("Coke", 1.5, 0, SugarLevel.ZERO);
        cart.add(coke);
        DairyProduct milk = new DairyProduct("Milk", 4, 0, Fat.FULLCREAM);
        cart.add(milk);

        double total =0;

        for(int i=0; i< cart.size(); i++)
        {
            total+= cart.get(i).getActualPrice();
        }

        System.out.println("The total price is: "+total);
    }
}
