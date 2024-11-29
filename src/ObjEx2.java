public class ObjEx2 {

        //By using method
        String color;
        int age;
        void initObj(String c,int a){
            color=c;
            age=a;
        }
        void display(){
            System.out.println(color+" "+age);
        }
        public static void main(String[] args){

            ObjEx2 buzo=new ObjEx2();
            buzo.initObj("black",10);
            buzo.display();

        }

}
