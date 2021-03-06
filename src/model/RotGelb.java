package model;

public class RotGelb implements Zustand {

    private Model model;

    public RotGelb(Model model) {
        this.model = model;
        model.setPhase(Ampelphase.ROTGELB);
    }

    @Override
    public void weiter(Model model) {
        model.setZustand(new Rot(model));
    }
}
