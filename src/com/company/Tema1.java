package com.company;

public class Tema1 {
    public Tema1(){
        public static void displayDigitsAndSum(int x){
            int sum = 0;
            System.out.print("Cifrele numarului sunt: ");
            while(x>0) {
                int lastDigits = x % 10;
                System.out.print(lastDigits + " , ");
                sum += lastDigits;
                x /= 10;
            }
            System.out.println();
            System.out.println("Suma cifrelor este: " + sum);

        }
    }
    public static void main(String[] args){
        int min = 32_000;
        int n;
        int sum=0;
        int v[100]
        int max = -32_000;
        int ma=0;
        for ( int i=0; i<n; i++){
            if(v[i]<min) min = v[i];
            }
        for ( int i=0; i<n; i++){
            if(v[i]>max) max = v[i];
        }
        System.out.println("Numarul minim: " + min);
        System.out.println("Numarul maxim: " + max);

        for (int i=0; i<n; i++){
            sum += v[i];

        }
    }

}
