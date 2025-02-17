import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int smallnumber(int num1,int num2,int num3) {
        int small=0;
      if(num1<num2&&num1<num3){
          small=num1;
      } else if (num2<num1&&num2<num3) {
          small=num2;
      }else{
          small=num3;
      }
      return small;
    }
    public static int checked(int number){
        if(number>0){
            System.out.println("the number is even.");
        } else if (number<0) {
            System.out.println("the number is odd.");
        }else{
            System.out.println("the number is zero.");
        }
        return number;
    }
    public static String passwordrules(String pass){
//        String charc="*.[a-z].*";
        String Digit="1234567890";
        String punctuation ="()*&^%$#@!-+=";
if(pass.length()>=8 && Digit.length()>=2 && pass!=punctuation){
    System.out.println("Password is valid: "+pass);
}
        return pass;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // 1 - Write a Java method to find the smallest number among three
       // numbers.
        System.out.println(smallnumber(25,37,29));
//2 - Write a Java method that check if the entered number is negative or
//positive or zero.
        System.out.println("Enter the number:");
        int number=input.nextInt();
        checked(number);
//3 - Write a Java method to check whether a string is a valid password.
//Password rules:
        System.out.println("Password rules:" +
                " 1. A password must have at least eight characters.\n"+
        "2. A password consists of only letters and digits.\n"+
        "3. A password must contain at least two digits "          );
        System.out.println("Enter the password:");
        String pass=input.next();
        passwordrules(pass);
    }

}