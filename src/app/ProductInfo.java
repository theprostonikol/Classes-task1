package app;

public class ProductInfo {

    static String name;
    static int quantity;
    static double price;
    static double taxRate;
    static Product product;
    static double income;
    static double tax;

    public static void main(String[] args){

        // Вызов метода инициализации переменных
        initVars();

        product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        income = calculateIncome(product.getQuantity(), product.getPrice());
        tax = calculateTax(income, taxRate);

        // Вызов метода вывода данных
        showData();
    }

    // Метод инициализации переменных
    private static void initVars() {
        // Инициализируйте переменные здесь
         name = "Iphone";
         quantity = 19;
         price = 1200;
         taxRate = 59.5;
    }

    //  Метод рассчета дохода
    private static double calculateIncome(int quantity, double price) {
        return quantity * price;
    }

    // Метод рассчета налога
    private static double calculateTax(double income, double taxRate ) {
        return income * taxRate / 100;
    }

    // Метод вывода данных
    private static void showData() {
        System.out.printf("%s%nПродано %d шт.%nДоход: %.2f грн.%nНалог: %.2f грн.",
                product.getName(), product.getQuantity(), income, tax);
   }
}
