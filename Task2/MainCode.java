package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainCode {
  public static void main(String[] args) {

    Rectangle r1 = new Rectangle(3, 2);
    System.out.printf("Мы построили прямоугольник высотой %s и шириной %s. ", r1.getHeight(), r1.getWidth());
    r1.setHeight(4);
    r1.setWidth(4);

    if (r1.isSquare() == true) // т.к. функцию isSquare мы преобразовали в класс Square, которому имплементили
                               // интерфейс
    { // CircleIn (см. Rectangle), то здесь надо переписать код - написать проверку с оператором
      // instanceof на предмет CircleIn.
      // Это нужно, чтобы соблюдался принцип подстановки Барбары Лисков

      CircleIn c1 = (x) -> Math.PI * Math.pow((x / 2), 2); 
      System.out.println("Площадь круга, вписанного в этот квадрат равна " + c1.circle(r1.getHeight()) + ". ");
    }

    List<Rectangle> list = new ArrayList<>();

    Rectangle r2 = new Rectangle(5, 1);
    Rectangle r3 = new Rectangle(2, 3);
    Rectangle r4 = new Rectangle(3, 8);
    Rectangle r5 = new Rectangle(4, 7);
    list.add(r1);
    list.add(r2);
    list.add(r3);
    list.add(r4);
    list.add(r5);

    Comparator<Rectangle> parComparator = new Comparator<Rectangle>() {

      @Override
      public int compare(Rectangle rect1, Rectangle rect2) {
        return (int) (rect1.area() - rect2.area());
      }
    };

    list.sort(parComparator);

    for (Rectangle rect : list) {
      System.out.println(rect.area());
    }

  }
}
