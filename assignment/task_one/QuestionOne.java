package assignment.task_one;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name :");
            int name = input.nextInt();
            
                    
            System.out.println("Enter your age :");
            int age=input.nextInt();
            
            if (age % 2==0)
                System.out.println(age +"is even");
            else
                System.out.println(age + "is odd");

            System.out.println("Name :"+ name);
            System.out.println("Age :"+age);

                    //computing the output
                    System.out.println("the number of your character is " + name);
                    System.out.println("your current age is  :" + age);
        }
            }
    }

