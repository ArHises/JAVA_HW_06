import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
//        1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//
//        2. Создать множество ноутбуков (ArrayList).
//
//        3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию.

        int laptopNumber = 30; // Number of laptops that will be created
        // Create an array of possible values for each property
        String[] companies = {"Apple", "Dell", "HP", "Lenovo", "Asus"};
        String[] types = {"Model A", "Model B", "Model C", "Model D", "Model E"};
        String[] colors = {"Black", "Blue", "White"};
        String[] processors = {"Intel i3", "Intel i5", "Intel i7"};
        int[] RAMs = {4, 8, 16};
        double[] prices = {999.99, 1299.99, 1599.99};

        Random random = new Random();
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();

        for (int i = 0; i < laptopNumber; i++) {
            // Generate random indices to select values for each property
            int companyIndex = random.nextInt(companies.length);
            int typeIndex = random.nextInt(types.length);
            int colorIndex = random.nextInt(colors.length);
            int processorIndex = random.nextInt(processors.length);
            int RAMIndex = random.nextInt(RAMs.length);
            int priceIndex = random.nextInt(prices.length);

            // Create a new laptop object with random values
            Laptop laptop = new Laptop(
                    companies[companyIndex],
                    types[typeIndex],
                    "LP-TP 00" + String.valueOf(i),
                    colors[colorIndex],
                    processors[processorIndex],
                    RAMs[RAMIndex],
                    prices[priceIndex]
            );

            // Add the laptop object to the laptopArrayList
            laptopArrayList.add(laptop);
            }
        // Print the laptopArrayList
        System.out.println("--- Full Inventory ---");
        for (Laptop laptop : laptopArrayList) {
            System.out.println(laptop);
        }
        findRelevant(laptopArrayList);
    }
        public static void findRelevant(ArrayList<Laptop> laptopArrayList){
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("--- Apply filter ---");
            System.out.println("(Enter for skip)");

            System.out.print("Enter minimum RAM: ");
            int ram = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter brand: ");
            String brand = scan.nextLine();

            System.out.print("Enter processor: ");
            String processor = scan.nextLine();

            System.out.print("Enter color: ");
            String color = scan.nextLine();

            System.out.println("Filter: ram: " + ram + ", brand: " + brand + ", processor: " + processor + ", color: " + color);

            for ( Laptop lp: laptopArrayList ) {
                if (    (lp.getRAM() >= ram || String.valueOf(ram).equals(""))
                        && (Objects.equals(lp.getCompany(), brand) || Objects.equals(brand, ""))
                        && (Objects.equals(lp.getProcessor(), processor) || Objects.equals(processor, ""))
                        && (Objects.equals(lp.getColor(), color) || Objects.equals(color, ""))
                ) { System.out.println(lp); }
            }
        }
}
