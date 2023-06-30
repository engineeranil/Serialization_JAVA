import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("AUDI","A6 LONG");
        try{
            FileInputStream inputStream = new FileInputStream("car.txt");
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);
            Car newCar = (Car) objectInput.readObject();
            System.out.println("MARKA : "+newCar.getBrand());
            System.out.println("MODEL : "+newCar.getModel());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        /*try{
            FileOutputStream inputStream = new FileOutputStream("car.txt");
            ObjectOutputStream input = new ObjectOutputStream(inputStream);
            input.writeObject(c1);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

    }
}
