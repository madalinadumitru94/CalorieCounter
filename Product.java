package CalorieCounter;

public class Product {
    String name;
    int fats;
    int carbohydrates;
    int proteins;
    int calories;

    public Product(String name, int fats, int carbohydrates, int proteins) {
        this.name = name;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.calories = computeCalories(fats, carbohydrates, proteins);
    }

    public static int computeCalories(int fats, int carbohydrates, int proteins) {
        return fats * 9 + carbohydrates * 4 + proteins * 4;
    }

    public int computeCaloriesNonStatic() {
        return fats * 9 + carbohydrates * 4 + proteins * 4;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", proteins=" + proteins +
                ", calories=" + calories +
                '}';
    }
}
