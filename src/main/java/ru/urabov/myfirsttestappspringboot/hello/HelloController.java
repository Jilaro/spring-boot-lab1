package ru.urabov.myfirsttestappspringboot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    // Коллекции создаются при первом вызове соответствующего метода update
    private List<String> arrayList;
    private Map<Integer, String> hashMap;

    // Ключ для следующей записи в HashMap
    private int nextKey = 1;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "s") String s) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            return "Первый вызов: создан пустой ArrayList";
        }
        arrayList.add(s);
        return "В ArrayList добавлено значение: " + s;
    }

    @GetMapping("/show-array")
    public List<String> showArrayList() {
        if (arrayList == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "s") String s) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
            return "Первый вызов: создан пустой HashMap";
        }
        hashMap.put(nextKey, s);
        return "В HashMap добавлена пара: " + (nextKey++) + " = " + s;
    }

    @GetMapping("/show-map")
    public Map<Integer, String> showHashMap() {
        if (hashMap == null) {
            return new HashMap<>();
        }
        return hashMap;
    }

    @GetMapping("/show-all-lenght")
    public String showAllLenght() {
        int listSize = (arrayList == null) ? 0 : arrayList.size();
        int mapSize = (hashMap == null) ? 0 : hashMap.size();
        return "Количество элементов в ArrayList: " + listSize
                + ", количество элементов в HashMap: " + mapSize;
    }
}
