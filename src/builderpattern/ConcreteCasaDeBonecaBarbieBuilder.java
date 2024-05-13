package src.builderpattern;
public class ConcreteCasaDeBonecaBarbieBuilder implements CasaDeBonecaBuilder {
    private CasaDeBoneca casaDeBoneca;

    public ConcreteCasaDeBonecaBarbieBuilder() {
        this.casaDeBoneca = new CasaDeBoneca();
    }

    @Override
    public void buildParedes() {
        casaDeBoneca.setParedes("Paredes rosa");
    }

    @Override
    public void buildPortas() {
        casaDeBoneca.setPortas("Portas de madeira");
    }

    @Override
    public void buildJanelas() {
        casaDeBoneca.setJanelas("Janelas com Vitrais");
    }

    @Override
    public void buildAndares() {
        casaDeBoneca.setAndares("3 andares");
    }

    @Override
    public void buildPapelDeParede() {
        casaDeBoneca.setPapelDeParede("Papel de Parede de Flores");
    }

    @Override
    public CasaDeBoneca getCasaDeBoneca() {
        return this.casaDeBoneca;
    }
}
