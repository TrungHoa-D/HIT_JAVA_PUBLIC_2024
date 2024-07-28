package btvnT2;

import java.util.Scanner;

public class Bai_3 {

    static int dx[]={0, 1, 0, -1};
    static int dy[]={1, 0, -1, 0};

    static int a[][] =new int[1005][1005]; //bien global
    static int vs[][]=new int[1005][1005];
    static int cnt=1 ;

    //bien ccrRow: Vi tri hien tai theo hang
    // ccrCol: vi tri hien tai theo cot

    public static void sol(int ccrRow, int ccrCol, int x, int y, int n){
        while( (ccrRow < n &&  ccrCol < n && ccrCol >=0 && ccrRow >=0) && vs[ccrRow][ccrCol] != 1){
            a[ccrRow][ccrCol]=cnt++;
            vs[ccrRow][ccrCol]=1; // gan vi tri do da duoc gan gia tri
            ccrRow+=x; // tang vi tri cua hang hien tai
            ccrCol+=y;// tang vi cua cot hien tai
        }
        ccrCol-=y;
        ccrRow-=x;
        // kiem tra huong di
        for(int i = 0 ;i < 4 ; i++) {
            int newX = ccrRow+dx[i];
            int newY = ccrCol+dy[i];
            if(newX >= 0 && newY >=0 && newX < n && newY < n && vs[newX][newY] != 1){
                sol(newX, newY, dx[i], dy[i], n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner Ip=new Scanner(System.in);
        int n = Ip.nextInt();
        sol(0,0, 0, 1 ,n);
        a[0][0]=1;
        vs[0][0]=1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
