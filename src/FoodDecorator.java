public abstract class FoodDecorator {
    private String nameModifier;
    private double costModifier;
    public String getNameModifier() {
        return nameModifier;
    }

    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    public double getCostModifier() {
        return costModifier;
    }

    public void setCostModifier(double costModifier) {
        this.costModifier = costModifier;
    }



    public Food modifyFood(Food food){
        Double cost = food.getCost();
        String name = food.toString();
        cost=cost+costModifier;
        name=name+nameModifier;
        return food;
    };


}
