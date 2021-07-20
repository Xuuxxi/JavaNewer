package vscode_java.src.test_class;

public class Test {
    public static void main(String args[]){
        People people = new People();

        people.set("Xuuxxi",1);

        people.speak();

        people = new People(100,"XIXI",2);

        people.speak();
    }
}
