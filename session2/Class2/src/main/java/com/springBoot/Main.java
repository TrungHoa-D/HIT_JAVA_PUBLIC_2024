package com.springBoot;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = sc.nextInt();
//        System.out.print("b: ");
//        int b = sc.nextInt();
//        System.out.println("a+b="+(a+b));
//        System.out.println("a-b="+(a-b));
//        System.out.println("a*b="+(a*b));
//        System.out.println("a%b="+(a%b));
//        System.out.println("a/b="+(a/b));

//        System.out.print("a: ");
//        int a = sc.nextInt();
//        int b = 5;
//        b+=a;//b=b+a
//        int c = 100;
//        c-=a;//c=c-a;
//        System.out.println(a+", "+b+", "+c);

//        int x=2;
//        int y=-1;
//        System.out.println(x>0 && y>0);
//        System.out.println(x>0 || y<0);
//        System.out.println(!(x>0));

//        int a=5, b=6;
//        if(a<b) System.out.println("yes");
//        else System.out.println("no");

//        System.out.println("Nhap lua chon: ");
//        int choise = sc.nextInt();
//        switch (choise) {
//            case 1: {System.out.println("one");break;}
//            case 2: {System.out.println("two");break;}
//            case 3: {System.out.println("three");break;}
//            default: System.out.println("sai");
//        }
//        int choise2 = sc.nextInt();
//        if(choise2==1){
//            System.out.println(1);
//        }
//        else if(choise2==2){
//            System.out.println(2);
//        }
//        else if(choise2==3){
//            System.out.println(3);
//        }
//        else {
//            System.out.println("khong ton tai!");
//        }

        int a = 5;
        int b = 5;
//        if(a > b) {
//            System.out.println("a lớn hơn b");
//        } else if(a < b) {
//            System.out.println("a nhỏ hơn b");
//        } else {
//            System.out.println("a bằng b");
//        }

//         System.out.println(a > b ? "a lớn hơn b" : a < b ? "a nhỏ hơn b" : "a bằng b");
//        System.out.println("n: ");
//        int n=sc.nextInt();
//        for(int i=1;i <=n;i++) {
//            System.out.print(i+" ");
//        }
        int j=1;
        while(j<=10){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }
        while(k<=10);

    }
}