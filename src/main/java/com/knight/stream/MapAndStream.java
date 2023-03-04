package com.knight.stream;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

class Sale {

  String fruitName;
  int price;
  double discount;

  public Sale(String fruitName, int price, double discount) {
    this.fruitName = fruitName;
    this.price = price;
    this.discount = discount;
  }
}

public class MapAndStream {

  public static void main(String[] args) {

    List<Sale> sales = Arrays.asList(
        new Sale("Apple", 5000, 0.05),
        new Sale("Orange", 4000, 0.2),
        new Sale("Grape", 2000, 0)
    );

    sales.stream()
        .map(sale -> Pair.of(sale.fruitName, sale.price * (1 - sale.discount)))
        .forEach(
            pair -> System.out.println(pair.getLeft() + " 실구매가 :" + pair.getRight() + "원 입니다."));

  }
}