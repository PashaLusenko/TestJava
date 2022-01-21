package com.example.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		for (int i = 1; i < 11; i++) {

			System.out.println("3*" + i + "=" + i * 3);
        }

		System.out.print("Введите число ->");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++){
			sum = sum + i;
		}
		System.out.println(sum);
		scanner.close();


	}
}
