import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T>{ //Обобщение воинов
    List<T> personages = new ArrayList<>();//Список воинов в команде
    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers (T personage){ //Заполнение списка
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage:this) {
            res.append(personage)
                    .append("\n");
        }
        res.append(String.format("Max dalnost: %d", maxRange()));
        return res.toString();
    }

    public int maxRange (){ //Максимальная дальность
        int max = 0;
        for (T pers:this) {
            if (pers instanceof Archer){
                Archer archer = (Archer) pers;
                if(archer.range()>max){
                    max= archer.range();
                }
            }
        }
        return max;
    }
}

//  НЕ РЕАЛИЗОВАН МЕТОД определения минимального щита члена команды в команде

//     public int minShield() {
//         int min = 0;
//         for (T item : personages) {
//             if (item instanceof Archer) {
//                 if (((Archer)item).protection() < min) {
//                     min = ((Archer)item).protection();
//                 }
//             }
//             else if (item instanceof Thief){
//                 if (((Thief)item).protection() < min) {
//                     min = ((Thief).protection();
//                 }
//             }
//         };
//         System.out.println("Min shield  : ");
//         return min;
// }
