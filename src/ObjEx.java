public class ObjEx {

    public void eat(){

        System.out.println("I am eating");

    }

    public static void main(String[] args){

        System.out.println("123");
        ObjEx buzo =new ObjEx();
        buzo.eat();
        buzo.run();

        Birds sp =new Birds();
        sp.fly();
    }
public void run(){

        System.out.println("I am runing");


    }

}
class Birds{
    void fly(){

        System.out.println("I am flying");
    }

}
