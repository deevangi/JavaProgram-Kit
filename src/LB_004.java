public class LB_004 {
    public static void main(String[] args){
        //Non-Primitive type
        String name ="Deevangi";

        System.out.println("print name:" + name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));

        //concatenate

        String name1 = "Test";
        String name2 ="User";
        String name3 = name1+ " and "+name2;
        System.out.println(name3);


        //replace function
        String name4 ="Deevangi";
        String name5= name4 .replace('e','a');
        System.out.println(name5);



        //substring
        String name6 ="test and user";
        System.out.println(name6.substring(0,4));
        System.out.println(name6.substring(5,9));


    }
}
