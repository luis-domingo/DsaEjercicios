package Figuras;

public class Quadrat extends Rectangle {

    public Quadrat(int r) {
        super(r, r);
    }

    @Override
    public String toString() {
        return "Quadrat l: "+ super.getL1()+" area: (("+this.area()+"))";
    }
}
