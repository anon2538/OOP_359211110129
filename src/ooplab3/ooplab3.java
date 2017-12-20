package ooplab3;

public class TestNestedLoop {

    public static void main(String[] args) {
        for (int i=0;i<8;i++) {
            for (int j = 1; j <= i; j++) {
                if(i==8||i==j||j==1)
                    System.out.print("*");
                else System.out.print("1");
            }//j
            System.out.println();
        }//i
    }//main
}//class