package com.knight.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayAndStream {

  public static void main(String[] args) {


    String[] arr = {"SQL","JAVA","Python"};
    Stream<String> stringStream = Arrays.stream(arr);

    stringStream.forEach(System.out::println);


  }


}
