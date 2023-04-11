public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>(); //Войско лучников с луками
        Team<Thief> thiefTeam = new Team<>();// Войско воров с ножами
        archers.addPers(new Archer("Robin", 100, new Bow(20), new OvalShied("Big")))
                .addPers(new Archer("Gud", 100, new Bow(15), new OvalShied("Small")));
        thiefTeam.addPers(new Thief("Jack", 150, new Knife(), new RoundShied("Medium")))
                .addPers(new Thief("Potroshitel", 150, new Knife(), new RoundShied("Medium")));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);

        Archer robin = new Archer("Robin", 50, new Bow(20), new OvalShied("Big"));
        Archer gud = new Archer("Gud", 50, new Bow(50), new OvalShied("Small"));
        Battle fight = new Battle(robin,gud); //Битва двух воинов
        fight.run(); //команда драться
    }
}