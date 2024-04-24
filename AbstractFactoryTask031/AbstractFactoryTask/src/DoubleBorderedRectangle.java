public class DoubleBorderedRectangle implements BorderedShape {

    @Override
    public void draw() {
        System.out.println("Drawing a Double Bordered Rectangle");
    }

    @Override
    public String getBorderType() {
        return "Double Border";
    }
}