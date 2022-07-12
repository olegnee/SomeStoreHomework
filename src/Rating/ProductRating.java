package Rating;

import ClientsExpierence.ClientsGrade;
import Product.Product;
import Warehouse.Warehouse;

//open - closed principle в интерфейсе сохранен метод для рейтинга, а класс можно расширить и добавить функцию оценки товара от клиентов.
// interface segregation principle, имплимитация двух интерфейсов.
public class ProductRating implements Rating, ClientsGrade {
    @Override
    public double grade(String someProduct) {
        double grade = 0;
        for (Product wantedProduct : Warehouse.WAREHOUSE) {
            if (someProduct.equalsIgnoreCase(wantedProduct.getName())) {
                grade = wantedProduct.getRating();
            }
        }
        return grade;
    }
    @Override
    public void clientsGrade(String choice) {
        double clientsGrade = 0;
        for (Product wantedProduct : Warehouse.WAREHOUSE) {
            if (choice.equalsIgnoreCase(wantedProduct.getName())) {
                wantedProduct.setClientsGrade(clientsGrade);
                System.out.println("Спасибо за Вашу оценку.");
            }
        }
    }

    public double avarageGrade (Product product) {
        return (product.getRating() + product.getClientsGrade()) / 2;
    }
}
