class Car {
    int speed=0;
    int regularPrice=0;
    String color="";
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }
    public int getSalePrice(int regularPrice){
        return regularPrice;
    }
  }
  
 class Truck extends Car {
    int weight;
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getSalePrice() {
        int price = regularPrice;
    if(weight > 2300)
        {
            price -= price/10;
        }
        else
        {
            price -= price/5;
        }
        return price;
    }
 
  }
public class Main
{
     public static void main(String[] args) {
        Truck myTruck = new Truck();
        myTruck.setWeight(2400);
        myTruck.setRegularPrice(100); 
        System.out.println(myTruck.getSalePrice());
    }
}