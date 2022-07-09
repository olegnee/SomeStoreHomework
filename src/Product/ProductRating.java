package Product;

import com.company.ClientsGrade;
import Rating.Rating;
import Warehouse.Warehouse;

//open - closed principle в интерфейсе сохранен метод для рейтинга, а класс можно расширить и добавить функцию оценки товара от клиентов.
// interface segregation principle, имплимитация двух интерфейсов.
public class ProductRating implements Rating, ClientsGrade {
    @Override
    public double grade(Product someProduct) {
        double grade = 0;
        if (someProduct.getName().equalsIgnoreCase("Цемент")) {
            grade = 5.0;
        }
        else if (someProduct.getName().equalsIgnoreCase("песок")){
            grade = 4.0;
        }
        else if (someProduct.getName().equalsIgnoreCase("мрамор")) {
            grade = 3.5;
        }
        return grade;
    }
    @Override
    public double clientsGrade(String choice) {
        if (Warehouse.WAREHOUSE.containsKey(choice)) {
            Product someProduct = Warehouse.WAREHOUSE.get(choice);
        }
        return 0;
        }
}
