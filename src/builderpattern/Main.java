package src.builderpattern;
public class Main {
    public static void main(String[] args) {

        // Casa Monster High
        CasaDeBonecaBuilder builder = new ConcreteCasaDeBonecaMonsterHighBuilder();
        CasaDeBonecaDirector director = new CasaDeBonecaDirector(builder);
        director.constructCasaDeBoneca();
        CasaDeBoneca casaDeBoneca = director.getCasaDeBoneca();
        System.out.println("Casa De Boneca Monster High Pronta !!: ");
        System.out.println(casaDeBoneca);

        // Casa Barbie
        CasaDeBonecaBuilder builderB = new ConcreteCasaDeBonecaBarbieBuilder();
        CasaDeBonecaDirector directorB = new CasaDeBonecaDirector(builderB);
        directorB.constructCasaDeBoneca();
        CasaDeBoneca casaDeBonecaB = directorB.getCasaDeBoneca();
        System.out.println("Casa De Boneca da Barbie Pronta !!: ");
        System.out.println(casaDeBonecaB);

    }
}
