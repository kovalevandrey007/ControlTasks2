import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StoreToys store = new StoreToys();

        // добавляем контструктор toys
        store.addToy(1, "Alpha", 2, 20);
        store.addToy(2, "Beta", 3, 30);
        store.addToy(3, "Charley", 4, 40);
        store.addToy(4, "Fox", 1, 10);

        // изменяем weight или toy
        store.setToyWeight(3, 40);

        // запускаем розыгрыш
        store.play();

        // обращаемся к prize toy
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
