package com.company;

public class Aritmetic {
    public Aritmetic(){

    }
    public int sum (int a, int b, int c, int d){
        int result = a+b+c+d;
        return result;
    }
    public int subtract (int a, int b, int c){
        int result = a-b-c;
        return result;
    }
    public int multiply (int a, int b){
        int result = a*b;
        return result;
    }
    public int devide (int a, int b){
        int result = a/b;
        return result;
    }
    public int mod (int a, int b){
        int result = a%b;
        return result;
    }
    public int xmultiply (int a, int b){
        int result = a;
        result *=b;
        return result;
    }
    public int power (int a, int b){
        a=a^b;
        return a;
    }
    public int minimum (int a, int b){
        int result = Math.min(a,b);
        return result;
    }
    public int maximum (int a, int b){
        int result = Math.max(a,b);
        return result;
    }
    public double squareRoot (int a){
        double result = Math.sqrt(a);
        return result;
    }
    public String concatenate(String a, String b){
        return a.concat(b);
    }
    public String upper(String a){
        return a.toUpperCase();
    }
    public Boolean compare(int a, int b){
        if(a<b){
            return true;
        }else {
            return false;
        }
    }
    public Boolean xcompare(int a, int b, int c){
        if(a<b && b>c){
            return true;
        }
        return false;
    }
    public String month(int a){
        String result;
        switch(a){
            case 1:
                result= "jan";
                break;
            case 2:
                result= "feb";
            break;
            case 3:
                result= "mar";
            break;
            case 4:
                result= "apr";
            break;
            case 5:
                result= "may";
            break;
            case 6:
                result= "jun";
            break;
            case 7:
                result= "jul";
            break;
            case 8:
                result= "aug";
            break;
            case 9:
                result= "sep";
            break;
            case 10:
                result= "oct";
            break;
            case 11:
                result= "nov";
            break;
            case 12:
                result= "dec";
            break;
            default:
                result= "hopa";
        }
        return result;
    }
    public static void lower(String[]a){
        for(int i=0; i<a.length; i++){
            a[i].toLowerCase();
            System.out.println(a[i]);
        }
    }
    public void echo(int a){
        int i=0;
        while(i<a){
            System.out.println("gfjtfj");
            i++;
        }

        }
public static int test(int a){
        return a+=1;

}
public static double test(double a, double b){
        return a*b;
}
public static String test(String a){
        return String.valueOf(a.indexOf(2));
}



}
