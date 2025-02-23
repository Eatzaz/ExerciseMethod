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
   public static void ch(){
        System.out.println("1. A password must have at least eight characters.   ");
        System.out.println("2. A password consists of only letters and digits.   ");
        System.out.println("3. A password must contain at least two digits    ");
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
       ch();
    }

}
