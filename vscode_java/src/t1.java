package vscode_java.src;


public class t1{
    public static void main(String arg[]){
        for(int i = 1;i < 10;i ++){
            for(int j = 1;j <= i;j ++){
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
