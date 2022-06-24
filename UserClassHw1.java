package com.syntax.class20;

public class UserClassHw1 {
    /*Write program: userClass  that has a constructor
    that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have
    user address variable and it also being initialized
    through constructor call.
    Print users name, mobile number and address in
     userDetails method. Test your code.*/

    String name;
    String MobileNumber;

    public UserClassHw1(String name, String mobileNumber) {
        this.name = name;
        MobileNumber = mobileNumber;
    }
}

    class userInfo extends UserClassHw1{
   String userAddress;
   userInfo(String name, String mobileNumber){
       super(name, mobileNumber);
       this.userAddress=userAddress;
   }
    void printInfo(){
        System.out.println("Name "+name+" Mobile number "+MobileNumber+"User Address "+userAddress);
    }

}