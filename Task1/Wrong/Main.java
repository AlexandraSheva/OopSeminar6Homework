// Здесь невозможно использовать интерфейс ни для одного из классов, так как в объекты каждого
// из перечисленных классов могут использовать только одну функцию из указанных в интерфейсе



interface ModeOfMovment {
  public void toFly ();

  public void toDrive();

  public void toSail();
}


// abstract class Machine {

//   public abstract void toMove();

// }

class Car /*extends Machine*/ implements ModeOfMovment {

}

class Ship /*extends Machine*/ implements ModeOfMovment {

}

class Airplane /*extends Machine*/ implements ModeOfMovment {

}

public static void main(String[] args) {
  
}

