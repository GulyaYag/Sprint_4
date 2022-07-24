package ru.yandex.praktikum;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss(String name) {
        if ((name.length() >= 3) && (name.length() <= 19) && (!name.startsWith(" ") && (!name.endsWith(" ") && (!name.contains("  ") && (name.contains(" ")))))) {
            return true;
        }
        return false;
    }
}
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
