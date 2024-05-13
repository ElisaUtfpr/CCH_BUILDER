package src.builderpattern;
public class CasaDeBonecaDirector {
    private CasaDeBonecaBuilder casaDeBonecaBuilder;

    public CasaDeBonecaDirector(CasaDeBonecaBuilder casaDeBonecaBuilder) {
        this.casaDeBonecaBuilder = casaDeBonecaBuilder;
    }

    public void constructCasaDeBoneca() {
        casaDeBonecaBuilder.buildParedes();
        casaDeBonecaBuilder.buildPortas();
        casaDeBonecaBuilder.buildJanelas();
        casaDeBonecaBuilder.buildAndares();
        casaDeBonecaBuilder.buildPapelDeParede();
    }

    public CasaDeBoneca getCasaDeBoneca() {
        return casaDeBonecaBuilder.getCasaDeBoneca();
    }
}
