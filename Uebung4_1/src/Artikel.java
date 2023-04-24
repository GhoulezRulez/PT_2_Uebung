public abstract class Artikel implements IBuyable {
    double price;
    double weight;

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getWeight(){
       return this.weight;

    }
    public void setWeight(double weight){
        this.weight= weight;
    }
}
