public interface IBuyable {

    double getPrice();
    double getWeight();

    public static double calculateSum(IBuyable price1, IBuyable... prices){
        double result = price1.getPrice();

        for(IBuyable price: prices) {

            result=result+price.getPrice();

        }
        return result;
    }

    public static double calculateWeight(IBuyable buyableObject, IBuyable... buyableObjects){

        double result = buyableObject.getWeight();
        for(IBuyable buyable : buyableObjects) {
            result = result + buyable.getWeight();
        }
        return result;
    }


}
