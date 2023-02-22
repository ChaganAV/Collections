package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1) Новый список
        List<String> list = new ArrayList<String>();
        list.add("Ромашка");
        list.add("Роза");
        list.add("Гладиолус");
        list.add("Тюльпан");
        list.add("Ландыш");
        System.out.println(list);
        for(String flower: list){
            System.out.println(flower);
        }
        System.out.println("-".repeat(15));
        // 2) Итерация
        List<String> list2 = new ArrayList<>();
        for(String flower: list){
            list2.add(flower+"!");
        }
        System.out.println(list);
        // 3) Вставка элемента
        list.add(0,"Фиалка");
        System.out.println(list);
        System.out.println("-".repeat(15));
        // 4) Извлечь элемент
        System.out.println(list2.get(1));
        System.out.println("-".repeat(15));
        // 5) Обновить элемент

        list2.remove(2);
        list2.add(2,"Орхидея");
        System.out.println(list2);
        System.out.println("-".repeat(15));
        // 6) Удаление третьего элемента
        list2.remove(2);
        System.out.println(list2);
        System.out.println("-".repeat(15));
        // 7) Поиск элемента
        for(String flower: list) {
            if(flower.equals("Тюльпан"))
                System.out.println(flower);
        }
        System.out.println("-".repeat(15));
        // 8) Новый список
        List<String> flowers = new ArrayList<>();
        for(int i=0;i<list.size()-1;i=i+2)
            flowers.add(list.get(i));
        System.out.println(flowers);
        System.out.println("-".repeat(15));
        // 9) Удалить из списка
        list.removeAll(flowers);
        System.out.println(list);
        // *10) Сортировка
        Collections.sort(list);
        System.out.println(list);

    }
}