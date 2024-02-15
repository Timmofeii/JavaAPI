//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Tima", 1111111);
        phoneBook.add("Tima", 3333333);
        phoneBook.add("Tima", 2222222);
        phoneBook.add("Tima", 4);
        phoneBook.add("Tima", 5);
        phoneBook.add("Sliva", 8);
        phoneBook.add("Sliva", 9);
        phoneBook.add("Sliva", 10);
        phoneBook.add("Sliva", 1111111);
        phoneBook.add("Dima", 4);
        phoneBook.add("Pivo", 1);
        phoneBook.add("Dima", 5);
        phoneBook.add("Kiva", 66666666);
        phoneBook.add("Kiva", 7);


        phoneBook.printContact();

    }
}