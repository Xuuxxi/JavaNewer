package vscode_java.src.test_class;

public class People extends Father{
    private String name;
    private int num;

    public People(int a,String b,int c){
        super(a);
        this.name = b;
        this.num = c;
    }
    
    public People(){}

    public void set(String a,int b){
        this.name = a;
        this.num = b;
    }

    public void speak(){
        System.out.print("hello my name is " + name + " and my number is " + num + ' ');
        super.Father_say();
    }
}
