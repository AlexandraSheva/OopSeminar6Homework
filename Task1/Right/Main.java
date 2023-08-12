package Task1.Right;

interface Flying {
  public void toFly();
}

interface Driving {

  public void toDrive();

}

interface Sailing {

  public void toSail();
}

class Car implements Driving {
  @Override
  public void toDrive() {
    System.out.println("Вы проехали 10 километров! ");
  }

}

class Ship implements Sailing {
  @Override
  public void toSail() {
    System.out.println("Вы проплыли 10 морских милль! ");
  }

}

class Airplane implements Flying {
  @Override
  public void toFly() {
    System.out.println("Вы пролетели 100 километров! ");
  }
}

public class Main {
  public static void main(String[] args) {
    Airplane airplane = new Airplane();
    airplane.toFly();

    Car car = new Car();
    car.toDrive();

    Ship ship = new Ship();
    ship.toSail();
  }
}