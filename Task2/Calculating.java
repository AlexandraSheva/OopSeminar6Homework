package Task2;

public interface Calculating {
  public double area();
  public double perimeter();
}

// Нарушение принципа разделения интерфейса. Стоило было разделить этот интерфейс на два,
//потому что не у всех фигур или классов можно посчитать периметр