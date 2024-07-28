package btvnT2;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner Ip=new Scanner(System.in);
        int n = Ip.nextInt(); // Nhap vao so nguyen n
        int a[] = new int[n]; // Khai bao mang so nguyen
        for(int i = 0 ; i < n; i++){
            a[i]= Ip.nextInt();  // nhap vao mang so nguyen
        }

        // xu li 2 vi tri la dau mang, cuoi mang

        for(int i =0 ; i < n ; i++){
            if(i % 2 != 0){ // kiem tra vi tri le
                int p = 0;
                if(i == n-1){ // kiem tra neu la vi tri cuoi cung cua mang
                    p= a[i-1];
                }
                else {
                    p = a[i - 1] - a[i + 1]; // lay chenh lech 2 phan tu lan can
                    if (p < 0) p *= -1;// de luon duong
                }
                a[i]+=p;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }
    }


}
