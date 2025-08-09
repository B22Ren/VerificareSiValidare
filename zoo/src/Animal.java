import java.util.Objects;

class Animal {
    private String specie;
    private String nume;

    public Animal() {
        //this.specie = "necunoscut";
        //this.nume = "necunoscut";
    }

    public Animal(String specie, String nume) {
        this.specie = specie;
        this.nume = nume;
    }

    public String getSpecie() {
        return specie;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (o == null || getClass() != o.getClass()) 
            return false;
        Animal animal = (Animal) o;
        return Objects.equals(specie, animal.specie) &&
               Objects.equals(nume, animal.nume);
    }
}
