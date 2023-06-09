package com.example.hw215;

import java.util.ArrayList;
import java.util.List;

public interface MyArr {
    Integer add(Integer item);

    Integer add(Integer item, int index);

    Integer remove(Integer item);

    Integer remove(int index);

    Integer set(int index, Integer item);

    Integer get(int index);

    boolean contains(Integer item);

    int indexOf(Integer item);

    int lastIndexOf(Integer item);

    boolean equals(List<Integer> otherlist);

    int size();

    boolean isEmpty();

    void clear();

    Integer[] toArray();

    public interface StringList {

        // Добавление элемента.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.
        Integer add(Integer item);

        // Добавление элемента
        // на определенную позицию списка.
        // Если выходит за пределы фактического
        // количества элементов или массива,
        // выбросить исключение.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.
        Integer add(int index, Integer item);

        // Установить элемент
        // на определенную позицию,
        // затерев существующий.
        // Выбросить исключение,
        // если индекс больше
        // фактического количества элементов
        // или выходит за пределы массива.
        Integer set(int index, Integer item);

        // Удаление элемента.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.
        Integer remove(Integer item);

        // Удаление элемента по индексу.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.
        Integer remove(int index);

        // Проверка на существование элемента.
        // Вернуть true/false;
        boolean contains(Integer item);

        // Поиск элемента.
        // Вернуть индекс элемента
        // или -1 в случае отсутствия.
        int indexOf(Integer item);

        // Поиск элемента с конца.
        // Вернуть индекс элемента
        // или -1 в случае отсутствия.
        int lastIndexOf(Integer item);

        // Получить элемент по индексу.
        // Вернуть элемент или исключение,
        // если выходит за рамки фактического
        // количества элементов.
        Integer get(int index);

        // Сравнить текущий список с другим.
        // Вернуть true/false или исключение,
        // если передан null.
        boolean equals(List<Integer> otherList);

        // Вернуть фактическое количество элементов.
        int size();

        // Вернуть true,
        // если элементов в списке нет,
        // иначе false.
        boolean isEmpty();

        // Удалить все элементы из списка.
        void clear();

        // Создать новый массив
        // из строк в списке
        // и вернуть его.
        Integer[] toArray();
    }
}
