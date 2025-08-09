import java.util.ArrayList;
import java.util.List;

class Zoo {

    private List<Animal> animale;

    public Zoo() {
        this.animale = new ArrayList<>();
    }

    public boolean addAnimal(Animal a) {
        return animale.add(a);
    }

    public boolean removeAnimal(Animal a) {
        return animale.remove(a);
    }

    public boolean areAnimals() {
        return !animale.isEmpty();
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animale);
    }

    public int size() {
        return animale.size();
    }
}
