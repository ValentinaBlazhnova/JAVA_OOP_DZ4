public class Battle { //Битва 2ух воинов
    private Warrior attacker; //Атакующий
    private Warrior defender; //Защитник

    public Battle(Warrior attacker, Warrior defender) { //Конструктор
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        while (true) {
            int attak = attacker.harm();
            defender.reduceHp(attak);
            System.out.printf("Voin %s nanosit %d ochkov yrona \nU voina %s ostalos %d hp\n", attacker.getName(), attak, defender.getName(), defender.getHp());
            if (!defender.isAlive()){
                System.out.printf("Voin %s pogib\n", defender.getName());
                System.out.printf("Pobeditel: \n%s", attacker);
                return attacker;
            }
            int response = defender.harm();
            attacker.reduceHp(response);
            System.out.printf("Voin %s dal v otvetky na %d ochkov yrona \nU voina %s ostalos %d hp\n", defender.getName(), response, attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()){
                System.out.printf("Voin %s pogib\n", attacker.getName());
                System.out.printf("Pobeditel: \n%s", defender);
                return defender;
            }
        }
    }
}
