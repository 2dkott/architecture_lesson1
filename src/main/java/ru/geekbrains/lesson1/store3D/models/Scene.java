package ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scene {

    private final int id;
    private final List<PoligonalModel> models = new ArrayList<>();
    private final List<Flash> flashes = new ArrayList<>();

    public Scene() {
        this(generateId());
    }

    public Scene(int id) {
        this.id = id;
    }

    private static int generateId() {
       return new Random().nextInt(6) + 5;
    }

    public Type method1(Type type) {
        return new Type();
    }

    public Type method2(Type type1, Type type2) {
        return new Type();
    }

}
