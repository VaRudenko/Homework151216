package com.hillel.homework1;

public class Homework1 {

  public static void main(String... args) {
    int a = 3;
    int b = 5;
    int c = 4;

    int min;

if (a < b) {
 if (a < c) {
  min = a;
} else {
  min = c;
 }
} else {
  if (b < c) {
    min = b;
  } else {
    min = c;
  }
}

System.out.println(min +"minimum");

	int max;

	if (a > b) {
	 if (a > c) {
	  max = a;
	} else {
	  max = c;
	 }
	} else {
	  if (b > c) {
	    max = b;
	  } else {
	    max = c;

 }
}

System.out.println(max +"maximum");

}
}
