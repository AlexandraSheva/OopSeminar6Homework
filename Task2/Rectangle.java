package Task2;

public class Rectangle implements Style, Show, Parameters, Drawing, Calculating {

  private double height;
  private double width;

  // Нарушение принципа единственной ответственности. Слишком много всего в одном
  // классе.
  // Надо разбить весь этот класс на несколько классов и уже им имплементить
  // интерфейсы
  // Например, конструктор, геттеры и сеттеры, area() и perimetr() объединила бы в
  // класс Rectangle,
  // которому бы имплементила два
  // интерфейса, полученных из Calculating (см. Calculating ).
  // draw() - отдельный класс Process;
  // isSquare () преобразовала бы в класс Square, производный от
  // Rectangle. И ему бы имплементила
  // интерфейсы из Calculating и CircleIn. В последнем надо указать функцию,
  // которая бы находила площадь
  // вписанной окружности,
  // а в самом классе - написать ее реализацию.

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Drawing rectangle...");

  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public double getHeight() {
    return height;
  }

  @Override
  public double getWidth() {
    return width;
  }

  public double area() {
    return getHeight() * getWidth();
  }

  public double perimeter() {
    return (getHeight() + getWidth()) * 2;
  }

  public boolean isSquare() { // Эту функцию и интерфейс CircleIn дописывала, когда уже был готов весь код
    return getHeight() == getWidth(); // Для этого мне ничего в уже сущесвтующем коде менять не пришлось -
  } // только дописать несколько строчек. Получается, был соблюден принцип
    // открытости/закрытости.

  public void showAll() {

    System.out.printf("Мы построили прямоугольник высотой %s, шириной %s, площадью %s, с периметром %s. ", getHeight(),
        getWidth(), area(), perimeter());
    System.out.printf("Цвет прямоугольника: %s. Обводка прямоугольника: %s.", COLOR, BORDERCOLOR);

  }

}
