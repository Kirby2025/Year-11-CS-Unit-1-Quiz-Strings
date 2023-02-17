public class Strings {

    public static void main(String[] args) {

        int age = 33;

        String name = "T Swizzle";

        System.out.println(age);

        System.out.println("age");

        String description = "My name is "+name+" and I am "+age+" years old.";

        System.out.println(description);

        System.out.println(description.length());

        String nameSubDescription = description.substring(11,20);

        // 9.
        int ageSubDescription = Integer.parseInt(description.substring(31,32));
        // 10.
        String subDescription = "My name is "+nameSubDescription+" and I am "+ageSubDescription+" years old.";
    }

}
