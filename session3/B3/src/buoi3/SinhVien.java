package buoi3;

import java.util.Scanner;

public class SinhVien {
    public static void main(String []args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        String res = s.toLowerCase();
        int check=1;
        for(int i=0;i<s.length()/2;i++) {
            if(res.charAt(i)!=res.charAt(s.length()-i-1)) {
                check=0;
                break;
            }
            check=1;
        }
        if(check==1) {
            System.out.print(s.toUpperCase());
        }
        else if(check==0){
            System.out.print(s.toLowerCase());
        }
    }
}
