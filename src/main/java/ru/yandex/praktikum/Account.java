package ru.yandex.praktikum;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss(String name) {
      if ((name.length() >= 3) && (name.length() <= 19) && (name.matches("^[A-ЯЁ]*[а-яё]*\\s[A-ЯЁ]*[а-яё]*$") && (!name.equals("null")))) {
            return true;
        } else {
            return false;
    }}}

        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
