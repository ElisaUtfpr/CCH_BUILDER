package src.builderpattern;
public interface CasaDeBonecaBuilder {
    void buildParedes();
    void buildPortas();
    void buildJanelas();
    void buildAndares();
    void buildPapelDeParede();
    CasaDeBoneca getCasaDeBoneca();
}