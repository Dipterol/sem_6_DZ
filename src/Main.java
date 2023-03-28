//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
//        NoteBook notebook1 = new NoteBook
//        NoteBook notebook2 = new NoteBook
//        NoteBook notebook3 = new NoteBook
//        NoteBook notebook4 = new NoteBook
//        NoteBook notebook5 = new NoteBook
//
//        Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет
//
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//
//        Класс сделать в отдельном файле
//
//        приветствие
//        Выбор параметра
//        выбор конкретнее
//        вывод подходящих

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(new NoteBook("Lenovo", 8, 256, "Windows", "Black"));
        notebooks.add(new NoteBook("HP", 16, 512, "Windows", "Silver"));
        notebooks.add(new NoteBook("Dell", 16, 512, "Linux", "Black"));
        notebooks.add(new NoteBook("Apple", 8, 512, "macOS", "Silver"));
        notebooks.add(new NoteBook("Acer", 16, 1000, "Windows", "Blue"));
        notebooks.add(new NoteBook("Apple",16, 1000, "MacOS", "Silver"));
        notebooks.add(new NoteBook("Apple",32, 512, "MacOS", "Silver"));
        notebooks.add(new NoteBook("MSI", 16, 1000, "Windows", "Black"));
        notebooks.add(new NoteBook("Lenovo", 16, 512, "Windows", "Blue"));
        notebooks.add(new NoteBook("HP", 8, 512, "Windows", "Black"));
        notebooks.add(new NoteBook("Asus", 32, 2000, "Windows", "Black"));
        notebooks.add(new NoteBook("Huawei", 16, 512, "Windows", "Silver"));

        System.out.println("Добро пожаловать в магазин электроники!");
        System.out.println("Для подбора ноутбука введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ (8, 16, 32 ГБ)");
        System.out.println("2 - Объем ЖД (256, 512, 1000 ГБ)");
        System.out.println("3 - Операционная система (Windows, macOS, Linux)");
        System.out.println("4 - Цвет (Black, Silver, Blue)");

        Scanner scanner = new Scanner(System.in);
        int filterCriteria = scanner.nextInt();

        System.out.println("Введите значение для выбранного критерия:");
        String filterValue = scanner.next();

        Set<NoteBook> filteredNoteBooks = filterLaptops(notebooks, filterCriteria, filterValue);
        System.out.println("Для вас подходят данные модели:");
        for (NoteBook notebook : filteredNoteBooks) {
            System.out.println(notebook);
        }
    }

    public static Set<NoteBook> filterLaptops(Set<NoteBook> notebooks, int filterCriteria, String filterValue) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            switch (filterCriteria) {
                case 1:
                    if (notebook.getRam() >= Integer.parseInt(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 2:
                    if (notebook.getStorage() >= Integer.parseInt(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 3:
                    if (notebook.getOs().equalsIgnoreCase(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 4:
                    if (notebook.getColor().equalsIgnoreCase(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий фильтрации.");
                    break;
            }
        }
        return filteredNotebooks;
    }
}




