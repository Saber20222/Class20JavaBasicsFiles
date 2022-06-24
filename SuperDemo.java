package com.syntax.class20;

public class SuperDemo{
    public static void main(String[] args) {
        chair chair=new chair();
        chair.printColor();
    }
}


    class Furniture {
   String color="Black";

}
class chair extends Furniture{
        String color="grey";

        void printColor(){
            String color="white";
            System.out.println(color);
            System.out.println(this.color);
            System.out.println(super.color
            );
        }
}
// always local variables are preferred by java