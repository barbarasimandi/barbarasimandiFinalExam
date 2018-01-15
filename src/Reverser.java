public class Reverser {

    StringBuilder normal;

    public Reverser() {
    }

    public String reverse(String somethingInWrongOrder) {
        normal = new StringBuilder();
        for (int i = somethingInWrongOrder.length() - 1; i >= 0; i--) {
            normal.append(somethingInWrongOrder.charAt(i));
        }
        return normal.toString();
    }
}
