package com.company;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);

        while (true){
            System.out.println("Enter the number to add to the list, enter 0 to stop.");
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            list.add(a);
        }
        popPush(list);
    }


    public static void popPush(ArrayList<Integer> perm){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> output = new ArrayList<>();

        for (int x : perm){
            while (s.size() > 0 && x > s.peek()){
                output.add(s.pop());
            }
            s.push(x);
        }
        while (s.size() > 0){
            output.add(s.pop());
        }
        System.out.println("The output is " + output);
    }
}
