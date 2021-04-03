public class Car {
    private int num;
    private double gas;

    public Car(){
        num  = 0;
        gas = 0.0;
        System.out.println("make a car");
    }

    public Car(int n,double g){
        num  = n;
        gas = g;

    }

    public void show(){
        System.out.println("car number" + num );
        System.out.println("gas is" + gas);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(5678,20.5);
        car2.show();
    }
}
