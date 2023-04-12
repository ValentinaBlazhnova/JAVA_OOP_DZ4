# JAVA_OOP_DZ4

Урок 4. ООП: Обобщения. ч1
На основе работы на уроке.
Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
Добавить метод определения минимального щита члена команды в команде (Не сделано), доделать:
В Warrior сделать геттер на поле S shieldable , и циклом найти минимум

for (T item : personages) {
if (item instanceof Warrior) {
if (((Warrior)item).getShield().protection() < min) {
min = ((Warrior)item).getShield().protection();
}
}
