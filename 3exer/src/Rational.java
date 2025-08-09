public class Rational {
    private int numarator;
    private int numitor;

    // Constructorul C1+eroare in caz de e 0
    public Rational(int numarator, int numitor) {
        if (numitor == 0) {
            throw new IllegalArgumentException("Numitorul nu poate fi 0.");
        }
        this.numarator = numarator;
        this.numitor = numitor;
        simplificare();
    }

    // Constructorul C2
    public Rational(int numarator) {
        this.numarator = numarator;
        this.numitor = 1; 
    }
    //3.5
 public Rational(String fractie) {
        String[] fractieParti = fractie.split("/");
        if (fractieParti.length == 1) {
            this.numarator = Integer.parseInt(fractieParti[0]);
            this.numitor = 1;
        } else if (fractieParti.length == 2) {
            this.numarator = Integer.parseInt(fractieParti[0]);
            this.numitor = Integer.parseInt(fractieParti[1]);
            if (this.numitor == 0) {
                throw new IllegalArgumentException("Numitorul nu poate fi 0.");
            }
        } else {
            throw new IllegalArgumentException("Format de fractie invalid: " + fractie);
        }
        simplificare();
    }
    public int getNumarator() {
        return numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    @Override
    public String toString() {
        return numarator + "/" + numitor;
    }
    //comparam 2 numere rationale 
    
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Rational rational = (Rational) obj;
        return numarator * rational.getNumitor() == numitor * rational.getNumarator();
    }
     
     public void simplificare() {
        int cmdc= cmdc(numarator, numitor);
        numarator /= cmdc;
        numitor /= cmdc;
    }
     
     private int cmdc(int a, int b) {
        return b == 0 ? a :cmdc(b, a % b);
    }
     
     //3.6
      public Rational adunare(Rational r) {
        int numaratorSuma = this.numarator * r.getNumitor() + this.numitor * r.getNumarator();
        int numitorSuma = this.numitor * r.getNumitor();
        return new Rational(numaratorSuma, numitorSuma);
    }

    
    public Rational scadere(Rational r) {
        int numaratorDiferenta = this.numarator * r.getNumitor() - this.numitor * r.getNumarator();
        int numitorDiferenta = this.numitor * r.getNumitor();
        return new Rational(numaratorDiferenta, numitorDiferenta);
    }

    
    public Rational inmultire(Rational r) {
        int numaratorProdus = this.numarator * r.getNumarator();
        int numitorProdus = this.numitor * r.getNumitor();
        return new Rational(numaratorProdus, numitorProdus);
    }

    
    public Rational impartire(Rational r) {
        int numaratorImpartire = this.numarator * r.getNumitor();
        int numitorImpartire = this.numitor * r.getNumarator();
        return new Rational(numaratorImpartire, numitorImpartire);
    }
}


