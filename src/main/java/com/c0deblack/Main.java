package com.c0deblack;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * <pre>
 * Problem statement
 * Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.
 *
 * Input
 *
 * The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
 *
 * Each test case is described with a single line containing a string S, the alphanumeric string.
 *
 * Output
 *
 * For each test case, output a single line containing the sum of all the digit characters in that string.
 *
 * Constraints
 *
 * 1 ≤ T ≤ 1000
 *
 * 1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
 *
 * Example
 * Input:
 * 1
 * ab1231da
 * Output:
 * 7
 *
 * Explanation
 * The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of strings you want to sum: ");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();


        System.out.println("Type a string and press enter for each input.");


        for(int i = 0; i < size; i++){
            String line = sc.next();

            System.out.println(
                Stream.of(line.split(""))
                        .filter(s -> s.charAt(0) >= '0' && s.charAt(0) <= '9')
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .sum()
            );
        }
    }


}