package src.builderpattern;
public class ConcreteCasaDeBonecaMonsterHighBuilder implements CasaDeBonecaBuilder {
    private CasaDeBoneca casaDeBoneca;

    public ConcreteCasaDeBonecaMonsterHighBuilder() {
        this.casaDeBoneca = new CasaDeBoneca();
    }

    @Override
    public void buildParedes() {
        casaDeBoneca.setParedes("Paredes de concreto");
    }

    @Override
    public void buildPortas() {
        casaDeBoneca.setPortas("Portas de Ferro");
    }

    @Override
    public void buildJanelas() {
        casaDeBoneca.setJanelas("Janelas de Vidro");
    }

    @Override
    public void buildAndares() {
        casaDeBoneca.setAndares("4 andares");
    }

    @Override
    public void buildPapelDeParede() {
        casaDeBoneca.setPapelDeParede("Papel de Parede de Caveiras");
    }

    @Override
    public CasaDeBoneca getCasaDeBoneca() {
        return this.casaDeBoneca;
    }
}
