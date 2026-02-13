package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {
    public abstract String speak();
<<<<<<< HEAD

    public static Comparator<Animal> AnimalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.name.compareToIgnoreCase(animal2.name);
        }
    };
=======
    public String name;
>>>>>>> 5c03dba8a6f0a2e8dbc62d35506b50d9df6ced76
}
