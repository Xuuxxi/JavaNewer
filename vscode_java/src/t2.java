package vscode_java.src;

import java.util.Arrays;

public class t2 {
    public static void main(String arg[]){
        int [] a;
        a = new int [10];
        for(int i = 0;i < 10;i ++) a[i] = i;

        System.out.println(Arrays.toString(a));

        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
    }
}
