package test;

public class PizzaService {

    public MyPizza myService(MyPizza myPizza){

        myPizza.toString();
        MyPizza pizza = new MyPizza();
        pizza.setName(myPizza.getName());
        pizza.setPrice(myPizza.getPrice());
        pizza.setSize(myPizza.getSize());

        if(myPizza.getSize().equals("M") || myPizza.getSize().equals("L"))
        {
            pizza.setPromotion(10);
            double priceReduc = myPizza.getPrice()*0.90;
            pizza.setPrice(priceReduc);
        }
        else if(myPizza.getSize().equals("XL")){
            pizza.setPromotion(15);
            double priceReduc = myPizza.getPrice()*0.85;
            pizza.setPrice(priceReduc);
        }
        else{
            pizza.setPromotion(5);
            double priceReduc = myPizza.getPrice()*0.95;
            pizza.setPrice(priceReduc);
        }

        return pizza;
    }
}
