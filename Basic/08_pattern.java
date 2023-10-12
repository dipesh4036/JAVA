
public class index {
    public static void main(String[] args) {

// print HOLLOW rectangle pattern
        // int rows = 4;
        // int cols = 5;

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= cols; j++) {
        // if (i == 1 || i == rows || j == 1 || j == cols) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

 // print inverted-rotated half-pyramid

        // for (int i = 1; i <=4; i++) {
        // for (int j = 1; j <=4-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// print inverted half-pyramid with numbers

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <5-i+2; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

// Floyd's triangle

        // int counter = 1;
        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <i+1; j++) {
        // System.out.print(counter+" ");
        // counter++;
        // }
        // System.out.println();
        // }

// 0-1 Triangle

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <=i; j++) {
        // if ((i+j)%2==0) {
        // System.out.print("1");
        // }
        // else{
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

// Butterfly Pattern

        // //1st half
        // for (int i = 1; i <=4; i++) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <=2*(4-i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // 2nd half
        // for (int i = 4; i >=1; i--) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <=2*(4-i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// solid rhomobus

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <=(5-i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// hollow Rhomobus

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <=(5-i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=5; j++) {
        // if (i==1 || i==5 || j==1 || j==5) {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

// dimond pattern

        // 1st half
        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <=5-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=(2*i)-1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // 2nd half
        // for (int i = 5; i >=1; i--) {
        // for (int j = 1; j <=5-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=(2*i)-1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }

}