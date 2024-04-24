public class DoubleBorderedTriangle implements BorderedShape {

    @Override
    public void draw() {
        System.out.println("Drawing a Double Bordered Triangle");
    }

    @Override
    public String getBorderType() {
        return "Double Border";
    }
}