import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите 5 слов в список А:");
        for (int i = 0; i < 5; i++) {
            String inputInA = scanner.nextLine();
            listA.add(inputInA);
        }
        System.out.println("Список А:");
        for (String item : listA) {
            System.out.println(item);
        }
        System.out.println("Введите 5 слов в список Б:");
        for (int i = 0; i < 5; i++) {
            String inputInB = scanner.nextLine();
            listB.add(inputInB);
        }
            System.out.println("Список Б:");
            for (String item : listB) {
                System.out.println(item);
            }
            List<String> listC = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                listC.add(listA.get(i));
                listC.add(listB.get(4 - i));
            }
        System.out.println("Список C:");
        for (String item : listC) {
            System.out.println(item);
        }
        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Отсортированный список C:");
        for (String item : listC) {
            System.out.println(item);
        }
        }

    }
