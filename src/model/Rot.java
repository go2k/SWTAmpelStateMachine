package model;

public class Rot implements Zustand {

    private Model model;

    public Rot(Model model) {
        this.model = model;
        model.setPhase(Ampelphase.ROT);
    }

    @Override
    public void weiter(Model model) {
        model.setZustand(new RotGelb(model));

    }
}
