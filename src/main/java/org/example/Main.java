package org.example;

import java.util.ArrayList;
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
        // 2) Итерация
        List<String> list2 = new ArrayList<>();
        for(String flower: list){
            list2.add(flower+"!");
        }
        System.out.println(list2);
        // 3) Вставка элемента
        list.add(0,"Фиалка");
        System.out.println(list);
        // 4) Извлечь элемент
        System.out.println(list2.get(1));
        // 5) Обновить элемент
        list2.remove(2);
        list2.add(2,"Орхидея");
        System.out.println(list2);
        // 6) Удаление третьего элемента
        list2.remove(2);
        System.out.println(list2);
        // 7) Поиск элемента
        for(String flower: list) {
            if(flower.equals("Тюльпан"))
                System.out.println(flower);
        }
    }
}