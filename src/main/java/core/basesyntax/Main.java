package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arr = new Figure[6];
        for (int i = 0; i < arr.length; i++) {
            if (i < 3) {
                arr[i] = figureSupplier.getRandomFigure();
            } else {
                arr[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : arr) {
            figure.draw();
        }
    }

}
