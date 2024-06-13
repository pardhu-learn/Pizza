public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsprice=150;
    private int takeAwayprice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAwayadded=false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg)
        {
            this.price=300;
        }
        else {
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void  addExtraCheese()
    {
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;

    }
    public void addextraToppings(){
        isExtraToppingsAdded=true;
        this.price+=extraToppingsprice;

    }
    public void takeAway(){
        isTakeAwayadded=true;
        this.price+=takeAwayprice;


    }
    public void getBill(){
        String bill="";
        System.out.println("The total Amount of a Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded)
        {
            bill+="Extra cheese added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded)
        {
            bill+="Extra Toppings added: "+extraToppingsprice+ "\n";
        }
        if(isTakeAwayadded)
        {
            bill+="Take Away: "+takeAwayprice+ "\n";
        }
        bill+="Bill: "+this.price +"\n";
        System.out.println(bill);



    }
}
