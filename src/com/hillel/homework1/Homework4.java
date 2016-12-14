package com.hillel.homework4;

public class Homework4 {

  public static void main(String... args) {
    int a = 8;
    int b = 13;
    int c = 10;

    int d = Math.abs(c-a);
    int e = Math.abs(c-b);
            if (d == e){
                System.out.println("Number "+ a +" and "+ b + " ravnoydalenu ot " + c);
            }
            if (d > e){
                System.out.println("Number " + b + " closer to " + c);
            }
            else {
                System.out.println("Number " + a + " closer to " + c);
            }
        }

    }
