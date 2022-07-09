package Product;

public class Product {
    private String name;
    private int amount;
    private String unitOfMeasure;
    private double rating;
    private double clientsGrade;

    // single - responsibility principle , класс продукт выполняет только логически связанный с ним функционал.

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getClientsGrade() {
        return clientsGrade;
    }

    public void setClientsGrade(double clientsGrade) {
        this.clientsGrade = clientsGrade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Product(String name, int amount, String unitOfMeasure) {
        this.name = name;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
